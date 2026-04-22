package oop_105755_FransiscusNatadhikaJoeMarco.week09

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)