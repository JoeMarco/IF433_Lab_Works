package oop_105755_FransiscusNatadhikaJoeMarco.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, damage)
    var enemyHp = 100

    println("\n-- BATTLE START! --")
    println("${hero.name} VS Enemy")

    while (hero.isAlive() && enemyHp > 0) {
        println("\n===============")
        println("STATUS:")
        println("${hero.name} HP: ${hero.hp}")
        println("Enemy HP: $enemyHp")
        println("===============")

        println("\nPilih Aksi:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")

        val choice = scanner.nextInt()

        when (choice) {
            1 -> {
                hero.attack("Enemy")
                enemyHp -= hero.baseDamage
                println("Enemy menerima ${hero.baseDamage} damage!")

                if (enemyHp > 0) {
                    println("Enemy HP tersisa: $enemyHp")

                    val enemyDamage = (10..20).random()
                    println("\nEnemy menyerang balik dengan $enemyDamage damage!")
                    hero.takeDamage(enemyDamage)
                    println("${hero.name} HP tersisa: ${hero.hp}")
                } else {
                    println("Enemy HP: 0 (MATI)")
                }
            }
            2 -> {
                println("\n${hero.name} kabur dari pertempuran!")
                break
            }
            else -> {
                println("Pilihan tidak valid! Kehilangan giliran!")
            }
        }

        if (!hero.isAlive()) {
            break
        }
    }

    println("\n===============")
    println("==  BATTLE END! ==")
    println("===============")

    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} MENANG!")
        println("HP tersisa: ${hero.hp}")
    } else if (!hero.isAlive()) {
        println("${hero.name} KALAH!")
        println("Enemy HP tersisa: $enemyHp")
    } else {
        println("${hero.name} melarikan diri dari pertempuran.")
        println("${hero.name} HP: ${hero.hp}")
        println("Enemy HP: $enemyHp")
    }
}
