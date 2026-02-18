package oop_105755_FransiscusNatadhikaJoeMarco.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji Tidak Boleh Negatif! Di-set ke 0")
                field = 0
            } else {
                field = value
            }
        }
}
