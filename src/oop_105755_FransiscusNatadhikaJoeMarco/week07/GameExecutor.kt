package oop_105755_FransiscusNatadhikaJoeMarco.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> {
            println("[SAFE ZONE] Kamu berada di zona aman. Istirahat sejenak...")
        }
        is BattleState.MonsterEncounter -> {
            println("[ENCOUNTER] Waspada! Monster '${event.monsterName}' muncul!")
            println("Siapkan senjatamu dan bertarung!")
        }
        is BattleState.LootDropped -> {
            val (itemName, itemDamage, itemRarity) = event.item
            println("[LOOT] Item jatuh: '$itemName'")
            println("Damage: $itemDamage | Rarity: $itemRarity (drop chance: ${itemRarity.dropChance}%)")
        }
        is BattleState.GameOver -> {
            println("[GAME OVER] Permainan berakhir!")
            println("Alasan: ${event.reason}")
        }
    }
}