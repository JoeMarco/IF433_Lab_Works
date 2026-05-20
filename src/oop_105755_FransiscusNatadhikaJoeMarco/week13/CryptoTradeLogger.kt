package oop_105755_FransiscusNatadhikaJoeMarco.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id:     Int,
    val symbol: String,
    val type:   String,
    val margin: Double,
    val pnl:    Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")
    return TradeRecord(
        id     = parts[0].toInt(),
        symbol = parts[1],
        type   = parts[2],
        margin = parts[3].toDouble(),
        pnl    = parts[4].toDouble()
    )
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id     = parts[0].toInt(),
            symbol = parts[1],
            type   = parts[2],
            margin = parts[3].toDouble(),
            pnl    = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { writer.println(it.toCsv()) }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File trades tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "LONG",  100.0,  25.5),
        TradeRecord(2, "ETHUSDT", "SHORT",  50.0, -10.2),
        TradeRecord(3, "SOLUSDT", "LONG",   75.0,  18.7)
    )

    saveTrades(trades, path = "crypto_trades.csv")
    println("Data trade berhasil disimpan ke crypto_trades.csv")

