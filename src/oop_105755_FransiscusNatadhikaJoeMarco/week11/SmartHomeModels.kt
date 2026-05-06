package oop_105755_FransiscusNatadhikaJoeMarco.week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)