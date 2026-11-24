import java.io.File

fun main() {
    val file = File("agenda_tugas_tp6.txt")
    val daftar = Penyimpanan.muat(file)
    val service = TugasService(daftar)

    var pilihan: Int
    do {
        println("\n=== AGENDA TUGAS ===")
        println("1. Tambah tugas")
        println("2. Tampilkan tugas")
        println("3. Cari tugas")
        println("4. Ubah status")
        println("5. Hapus tugas")
        println("6. Filter tugas")
        println("7. Statistik")
        println("8. Simpan data")
        println("0. Keluar")
        print("Pilihan: ")
        pilihan = readln().toIntOrNull() ?: -1

        when (pilihan) {
            1 -> {
                print("ID tugas: ")
                val id = readln()
                print("Judul tugas: ")
                val judul = readln()
                println(if (service.tambah(id, judul)) "Tugas ditambahkan" else "Data tidak valid atau ID duplikat")
            }
            2 -> service.tampilkan()
            3 -> {
                print("ID yang dicari: ")
                val hasil = service.cari(readln())
                println(hasil ?: "Tugas tidak ditemukan")
            }
            4 -> {
                print("ID tugas: ")
                println(if (service.ubahStatus(readln())) "Status diubah" else "Tugas tidak ditemukan")
            }
            5 -> {
                print("ID tugas yang dihapus: ")
                println(if (service.hapus(readln())) "Tugas dihapus" else "Tugas tidak ditemukan")
            }
            6 -> {
                print("Status (selesai/belum): ")
                val status = readln().trim().lowercase()
                val hasil = when (status) {
                    "selesai" -> service.filter(true)
                    "belum" -> service.filter(false)
                    else -> null
                }
                if (hasil == null) {
                    println("Status tidak valid")
                } else if (hasil.isEmpty()) {
                    println("Tidak ada tugas dengan status tersebut")
                } else {
                    hasil.forEach { println("${it.id} | ${it.judul}") }
                }
            }
            7 -> println(service.statistik())
            8 -> println(if (Penyimpanan.simpan(file, daftar)) "Data disimpan" else "Data gagal disimpan")
            0 -> {
                Penyimpanan.simpan(file, daftar)
                println("Program selesai")
            }
            else -> println("Pilihan tidak tersedia")
        }
    } while (pilihan != 0)
}
