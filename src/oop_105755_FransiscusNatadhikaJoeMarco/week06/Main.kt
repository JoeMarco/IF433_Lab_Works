package oop_105755_FransiscusNatadhikaJoeMarco.week06

fun main() {
    val lamp    = SmartLamp(id = "LAMP-01",  name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "SPK-01", name = "Google Nest Dapur")
    val cctv    = SmartCCTV(id = "CCTV-01",  name = "Ezviz Garasi")
    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}