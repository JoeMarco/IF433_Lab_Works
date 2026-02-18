package oop_105755_FransiscusNatadhikaJoeMarco.week03

open class student {
    private var name="Unknown"
    private var nilai: Int = 0;
    protected var jmlhsks: Int = 0

    fun set_jmlhsks(sks: Int) {
        if (sks < 0) {
            println("SKS Ga Boleh Minus Ya..")
        } else {
            this.jmlhsks = sks
        }
    }

    public fun set_name(namaOrang: String) {
        if(namaOrang.length < 0) {
            println("Eh Nama Gaboleh Kosong Yaaa, No No..Ya")
        } else {
            this.name = namaOrang
        }
    }
    public fun set_nilai(nilai: Int) {
        if(nilai < 0) {
            println("Sorry Ya Brow, Nilai Ga Mungkin Minus Cuyy..")
        } else {
            this.nilai = nilai
        }
    }

    public fun get_name():String {
        return this.name
    }

    public fun get_nilai(): Int {
        return this.nilai
    }

    class matakuliah: student() {
        fun muncul_jmlhsks():Int {
            return this.jmlhsks
        }
    }
}

fun main() {
    var mahasiswa = student.matakuliah()
    mahasiswa.set_name("Budi")
    mahasiswa.set_nilai(0)
    mahasiswa.set_jmlhsks(3)
    println("Nama Kamu: ${mahasiswa.get_name()} dan Nilai Kamu: ${mahasiswa.get_nilai()}")
    println("SKS kamu: ${mahasiswa.muncul_jmlhsks()}")
    // println("Hai " + mahasiswa.name + " Nilai Kamu ${mahasiswa.nilai}")
}