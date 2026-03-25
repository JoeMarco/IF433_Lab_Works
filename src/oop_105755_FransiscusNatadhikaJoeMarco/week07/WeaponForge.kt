package oop_105755_FransiscusNatadhikaJoeMarco.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            println("Menempa Pedang Pemula...")
            val item = GameItem(
                name = "Pedang Kayu Bapuk",
                damage = 5,
                rarity = ItemRarity.COMMON
            )
            return Weapon(item, durability = 50)
        }

        fun forgeEpicSword(): Weapon {
            println("Menempa Pedang Epik! Butuh bahan langka...")
            val item = GameItem(
                name = "Excalibur Retak",
                damage = 85,
                rarity = ItemRarity.EPIC
            )
            return Weapon(item, durability = 200)
        }
    }

    override fun toString(): String {
        return "Weapon(name='${item.name}', damage=${item.damage}, " +
                "rarity=${item.rarity}, durability=$durability)"
    }
}