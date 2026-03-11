package oop_105755_FransiscusNatadhikaJoeMarco.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Lampu menyala dengan cahaya hangat")
    }

    override fun turnOff() {
        println("[$name] Lampu dimatikan")
    }
}