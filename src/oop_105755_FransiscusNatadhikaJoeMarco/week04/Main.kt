package oop_105755_FransiscusNatadhikaJoeMarco.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myTesla = ElectricCar(brand = "Tesla Model 3", numberOfDoors = 4, batteryCapacity = 90)
    myTesla.accelerate()
    myTesla.honk()
    myTesla.openTrunk()

    println("\n--- Tugas Mandiri Different Files ---")
    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager(name = "Budi", baseSalary = 8000000)
    val developer = Developer(name = "Joe", baseSalary = 7000000, programmingLanguage = "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}