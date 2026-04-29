package oop_105755_FransiscusNatadhikaJoeMarco.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC",  0.85))
    coinRepo.add(Coin("ETH",  5.20))
    coinRepo.add(Coin("USDT", 1500.00))

    val response = ApiResponse("200 OK", coinRepo.getAll())

