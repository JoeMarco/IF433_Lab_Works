package oop_105755_FransiscusNatadhikaJoeMarco.week05

import oop_105755_FransiscusNatadhikaJoeMarco.week05.Pegawai

class Admin(nama:String): Pegawai(nama) {
    override fun bekerja() {
        println("$nama sedang duduk di depan komputer melayani administrasi.")
    }

    fun doAdminWork() {
        println("$nama sedang merekap data absensi mahasiswa")
    }
}