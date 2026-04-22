package oop_105755_FransiscusNatadhikaJoeMarco.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT",  "LONG",  20, +15.5, "CLOSED"),
        TradeLog("ETHUSDT",  "SHORT", 10,  -5.2, "CLOSED"),
        TradeLog("BTCUSDT",  "SHORT", 15,  +8.3, "CLOSED"),
        TradeLog("SOLUSDT",  "LONG",  10,  -12.0,"CLOSED"),
        TradeLog("ETHUSDT",  "LONG",  25,  +22.7,"CLOSED"),
        TradeLog("SOLUSDT",  "SHORT",  5,   -3.1,"CLOSED"),
        TradeLog("BTCUSDT",  "LONG",  10,   +4.0,"OPEN"),
        TradeLog("ETHUSDT",  "SHORT", 20,   -1.5,"OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}