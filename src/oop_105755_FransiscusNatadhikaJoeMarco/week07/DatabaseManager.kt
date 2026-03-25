package oop_105755_FransiscusNatadhikaJoeMarco.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database connection is established.")
    }
}