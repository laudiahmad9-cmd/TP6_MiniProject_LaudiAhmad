# Agenda Tugas Siswa

## Latar Belakang dan Masalah

Siswa membutuhkan pencatatan tugas sederhana agar tugas dapat ditambah, dicari, diubah statusnya, disimpan, dan dipulihkan.

## Pengguna dan Tujuan

Pengguna utama adalah siswa dan pengelola kelas. Tujuan aplikasi adalah menyediakan menu console untuk mengelola daftar tugas tanpa basis data.

## Fitur Utama

- Tambah tugas dengan ID unik.
- Tampilkan seluruh tugas.
- Cari tugas berdasarkan ID.
- Ubah status selesai/belum.
- Hapus tugas.
- Filter tugas berdasarkan status.
- Simpan dan muat tugas dari berkas teks.

## Teknologi dan Struktur Berkas

- Kotlin/JVM Console
- `java.io.File`
- Git dan GitHub

```text
src/
  Model.kt
  TugasService.kt
  Penyimpanan.kt
  Main.kt
docs/
  ANALISIS_RANCANGAN.md
  TABEL_PENGUJIAN.md
  LAPORAN_PRAKTIK.md
  PRESENTASI.md
tests/
  TEST_CASES.txt
```

## Cara Menjalankan

```powershell
C:\Kotlin\kotlinc\bin\kotlinc.bat src\*.kt -d tp6.jar
C:\Java\jdk-21.0.13.1+2\bin\java.exe -cp "tp6.jar;C:\Kotlin\kotlinc\lib\kotlin-stdlib.jar" MainKt
```

## Hasil Pengujian

Lihat `docs/TABEL_PENGUJIAN.md`. Pengujian mencakup data normal, duplikat, judul kosong, pencarian tersedia/tidak tersedia, pilihan salah, penyimpanan, pemuatan, record rusak, hapus tugas, dan filter status.

## Pembagian Tugas dan Branch

- `main`: integrasi stabil.
- `fitur-menu`: pengembangan menu utama.
- `fitur-pengelolaan`: pengembangan hapus tugas dan filter status.

## Riwayat Pengembangan Ringkas

Riwayat lengkap tersedia melalui `git log --oneline --decorate --graph`.

## Keterbatasan dan Rencana Pengembangan

- Belum memiliki autentikasi pengguna.
- Penyimpanan menggunakan satu berkas teks.
- Pencarian saat ini dilakukan berdasarkan ID.
- Pengembangan berikutnya dapat menambahkan prioritas tugas, tenggat waktu, dan pencarian berdasarkan judul.
