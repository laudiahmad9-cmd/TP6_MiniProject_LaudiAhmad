# Analisis dan Rancangan

## Project Brief

- Judul proyek: Agenda Tugas Siswa
- Masalah: Catatan tugas mudah hilang atau tidak konsisten.
- Pengguna: Siswa dan pengelola kelas.
- Tujuan: Mengelola tugas dengan data yang dapat disimpan.
- Fitur wajib: tambah, tampil, cari, ubah status, simpan/muat.
- Fitur tambahan: hapus, filter status, statistik.
- Data: ID, judul, status selesai.
- Validasi: ID dan judul tidak boleh kosong; ID tidak boleh duplikat; pilihan harus valid.
- Penyimpanan: berkas `agenda_tugas_tp6.txt`.
- Batasan: Tidak menyediakan GUI atau autentikasi.

## Kebutuhan Fungsional

1. Menambah tugas.
2. Menampilkan tugas.
3. Mencari tugas berdasarkan ID.
4. Mengubah status.
5. Menghapus tugas.
6. Memfilter tugas.
7. Menyimpan dan memuat berkas.

## Kebutuhan Nonfungsional

- Pesan harus jelas.
- Struktur kode terpisah berdasarkan tanggung jawab.
- Record berkas rusak dilewati.
- Aplikasi tetap berjalan pada data kosong.

## Pseudocode

1. Muat berkas agenda.
2. Tampilkan menu.
3. Baca pilihan.
4. Jalankan fitur sesuai pilihan.
5. Validasi input.
6. Perbarui Collection atau berkas.
7. Simpan saat keluar atau pilihan simpan.
8. Ulangi sampai pilihan 0.
