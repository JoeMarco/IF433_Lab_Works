fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000
    val finalPrice = calculateFinalPrice(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun printReceipt(title: String, finalPrice: Int) {
    println("=== Struk Pembelian SteamKW ===")
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
}