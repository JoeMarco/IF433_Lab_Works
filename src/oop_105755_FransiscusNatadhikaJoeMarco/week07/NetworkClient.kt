package oop_105755_FransiscusNatadhikaJoeMarco.week07

class NetworkClient private constructor(val url:String) {
    fun connect() {
        println("Connecting to $url...")
    }
}