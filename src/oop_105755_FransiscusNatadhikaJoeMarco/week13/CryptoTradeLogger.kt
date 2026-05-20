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