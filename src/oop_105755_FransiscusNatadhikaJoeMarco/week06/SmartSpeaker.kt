package oop_105755_FransiscusNatadhikaJoeMarco.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Speaker menyala dan siap digunakan.")
    }

    override fun turnOff() {
        println("[$name] Speaker dimatikan.")
    }

    fun playMusic(song: String) {
        println("[$name] Memutar lagu $song dari Spotify.")
    }
}