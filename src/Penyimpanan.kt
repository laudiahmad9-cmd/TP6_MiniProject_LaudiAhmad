import java.io.File
import java.io.IOException

object Penyimpanan {
    fun muat(file: File): MutableList<Tugas> {
        val hasil = mutableListOf<Tugas>()
        if (!file.exists()) return hasil

        try {
            for (baris in file.readLines()) {
                val bagian = baris.split(";")
                if (bagian.size != 3) continue
                val id = bagian[0].trim()
                val judul = bagian[1].trim()
                val selesai = bagian[2].trim().toBooleanStrictOrNull() ?: continue
                if (id.isNotBlank() && judul.isNotBlank()) {
                    hasil.add(Tugas(id, judul, selesai))
                }
            }
        } catch (e: IOException) {
            println("Berkas tidak dapat dibaca: ${e.message}")
        } catch (e: SecurityException) {
            println("Akses berkas ditolak")
        }
        return hasil
    }

    fun simpan(file: File, data: List<Tugas>): Boolean {
        return try {
            val teks = data.joinToString("\n") {
                "${it.id};${it.judul};${it.selesai}"
            }
            file.writeText(teks)
            true
        } catch (e: IOException) {
            println("Berkas tidak dapat ditulis: ${e.message}")
            false
        } catch (e: SecurityException) {
            println("Akses berkas ditolak")
            false
        }
    }
}
