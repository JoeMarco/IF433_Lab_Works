package oop_105755_FransiscusNatadhikaJoeMarco.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000
    val finalPrice = calculateFinalPrice(price)
    val userNote: String? = null

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote ?: "Tidak ada catatan"
    )
}

fun calculateFinalPrice(price: Int): Int =
    if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(title: String, finalPrice: Int, note: String) {
    println("=== Struk Pembelian SteamKW ===")
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan    : $note")
}