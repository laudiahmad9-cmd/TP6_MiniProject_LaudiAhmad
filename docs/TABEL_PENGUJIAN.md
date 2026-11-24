# Tabel Pengujian

| No | Fitur/Kondisi | Data Uji | Hasil Diharapkan | Hasil Aktual | Status |
|---|---|---|---|---|---|
| 1 | Mulai tanpa berkas | Berkas tidak ada | Daftar kosong dan program terbuka | Daftar kosong; program terbuka | Berhasil |
| 2 | Tambah valid | T01; Belajar Kotlin | Tugas ditambahkan | Tugas ditambahkan | Berhasil |
| 3 | ID duplikat | T01; judul lain | Ditolak | Pesan data tidak valid atau ID duplikat | Berhasil |
| 4 | Judul kosong | T02; kosong | Ditolak | Pesan data tidak valid atau ID duplikat | Berhasil |
| 5 | Cari tersedia | T01 | Data ditemukan | Tugas ditampilkan | Berhasil |
| 6 | Cari tidak tersedia | T999 | Pesan tidak ditemukan | Tugas tidak ditemukan | Berhasil |
| 7 | Ubah status | T01 | Status berubah | Status diubah | Berhasil |
| 8 | Pilihan salah | Huruf | Pesan pilihan tidak tersedia | Pilihan tidak tersedia | Berhasil |
| 9 | Simpan dan muat | T01; selesai | Data tetap tersedia | Data disimpan dan dimuat ulang | Berhasil |
| 10 | Record rusak | Baris tanpa 3 bagian | Baris dilewati | Record dilewati tanpa hentikan program | Berhasil |
| 11 | Hapus tugas | T01 | Tugas dihapus | Tugas dihapus | Berhasil |
| 12 | Filter status | selesai/belum | Daftar sesuai status | Daftar sesuai status | Berhasil |
