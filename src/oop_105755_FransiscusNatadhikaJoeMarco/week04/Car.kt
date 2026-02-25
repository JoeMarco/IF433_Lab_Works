package oop_105755_FransiscusNatadhikaJoeMarco.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu terbuka")
    }
}