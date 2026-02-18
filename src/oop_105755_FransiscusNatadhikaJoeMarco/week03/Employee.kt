package oop_105755_FransiscusNatadhikaJoeMarco.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba Set Gaji Ke: $value")
            this.salary = value
        }
}
