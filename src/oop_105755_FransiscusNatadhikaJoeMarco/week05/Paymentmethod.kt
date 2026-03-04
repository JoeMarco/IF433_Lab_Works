package oop_105755_FransiscusNatadhikaJoeMarco.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}