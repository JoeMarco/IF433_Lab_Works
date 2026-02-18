package oop_105755_FransiscusNatadhikaJoeMarco.week03

fun main() {
    println("-- Test Weapon --")
    val sword = weapon("Excalibur")
    sword.damage = -50
    sword.damage = 9999
    println("Weapon: ${sword.name}, Damage: ${sword.damage}, Tier: ${sword.tier}!")
}

