class TugasService(private val daftar: MutableList<Tugas>) {
    fun tambah(id: String, judul: String): Boolean {
        val idBersih = id.trim()
        val judulBersih = judul.trim()
        if (idBersih.isBlank() || judulBersih.isBlank()) return false
        if (daftar.any { it.id.equals(idBersih, ignoreCase = true) }) return false
        daftar.add(Tugas(idBersih, judulBersih))
        return true
    }

    fun tampilkan() {
        if (daftar.isEmpty()) {
            println("Belum ada tugas")
            return
        }
        for ((indeks, tugas) in daftar.withIndex()) {
            val status = if (tugas.selesai) "Selesai" else "Belum"
            println("${indeks + 1}. ${tugas.id} | ${tugas.judul} | $status")
        }
    }

    fun cari(id: String): Tugas? =
        daftar.find { it.id.equals(id.trim(), ignoreCase = true) }

    fun ubahStatus(id: String): Boolean {
        val tugas = cari(id) ?: return false
        tugas.selesai = !tugas.selesai
        return true
    }

    fun hapus(id: String): Boolean {
        val tugas = cari(id) ?: return false
        return daftar.remove(tugas)
    }

    fun filter(selesai: Boolean): List<Tugas> =
        daftar.filter { it.selesai == selesai }

    fun statistik(): String {
        val jumlahSelesai = daftar.count { it.selesai }
        return "Total=${daftar.size}, Selesai=$jumlahSelesai, Belum=${daftar.size - jumlahSelesai}"
    }
}
