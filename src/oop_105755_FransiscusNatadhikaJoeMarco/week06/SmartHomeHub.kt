package oop_105755_FransiscusNatadhikaJoeMarco.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("[Hub] Perangkat '${device.name}' berhasil ditambahkan")
    }

    fun turnOffAllSwitches() {
        println("\n[Hub] Mematikan semua perangkat Switchable...")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\n[Hub] === MODE KEAMANAN DIAKTIFKAN ===")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}