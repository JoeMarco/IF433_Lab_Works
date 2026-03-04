package oop_105755_FransiscusNatadhikaJoeMarco.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------------------------------------------------")
    }

   //Tugas Mandiri 1
    println("\n=== TUGAS MANDIRI 1: MathHelper Overloading ===")
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(sisi = 5)
    println("Luas Persegi (sisi=5): $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(panjang = 4, lebar = 7)
    println("Luas Persegi Panjang (4x7): $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(jariJari = 3.5)
    println("Luas Lingkaran (r=3.5): $luasLingkaran")


    //Tugas Mandiri 2
    println("\n=== TUGAS MANDIRI 2: Sistem Pembayaran ===")

    val ewallet = EWallet(accountName = "Budi", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Ani", limit = 100000.0)
    val daftarPembayaran: List<PaymentMethod> = listOf(ewallet, creditCard)

    println("=== SISTEM PEMBAYARAN ===")
    for (payment in daftarPembayaran) {
        payment.processPayment(75000.0)
        println("-------------------------")
    }
}

}