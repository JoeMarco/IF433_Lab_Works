package oop_105755_FransiscusNatadhikaJoeMarco.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("[$name] CCTV menyala dan mulai memantau area.")
        startRecord() // otomatis mulai rekam saat menyala
    }

    override fun turnOff() {
        println("[$name] CCTV dimatikan.")
    }

    override fun startRecord() {
        println("[$name] Perekaman dimulai secara otomatis.")
    }
}