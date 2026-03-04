package oop_105755_FransiscusNatadhikaJoeMarco.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran EWallet sebesar Rp$amount berhasil. Sisa saldo: Rp$balance")
        } else {
            println("[$accountName] Pembayaran EWallet gagal. Saldo tidak cukup. Saldo saat ini: Rp$balance")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top-up EWallet sebesar Rp$amount berhasil. Saldo sekarang: Rp$balance")
    }
}