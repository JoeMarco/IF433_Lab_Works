package oop_105755_FransiscusNatadhikaJoeMarco.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val req1 = RegularUser("Alice",22)
    val req2 = RegularUser("Alice", age = 22)
    println(req1)
    println("Sama? ${req1 == req2}")
}