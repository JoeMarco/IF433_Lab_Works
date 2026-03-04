package oop_105755_FransiscusNatadhikaJoeMarco.week05

import oop_105755_FransiscusNatadhikaJoeMarco.week05.Pegawai

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("$nama sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    fun mengajar() {
        println("$nama sedang mengajar mahasiswa di kelas.")
    }
}