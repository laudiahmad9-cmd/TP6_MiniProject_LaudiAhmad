# Audit Individu

## Kontribusi Pribadi

Laudi Ahmad Akbar Sanusi bertanggung jawab atas model data, struktur proyek, fitur menu, pengembangan branch, pengujian, penyimpanan berkas, dokumentasi, dan audit repository.

## Tiga Commit Utama

1. `Menambahkan model data tugas`: menambahkan model `Tugas` dan memisahkan struktur data.
2. `Menambahkan menu utama dan operasi agenda tugas`: membangun alur console utama dan pemanggilan service.
3. `Menambahkan hapus tugas filter status dan statistik`: menambahkan fitur tambahan dan memperluas pengujian.

## Working Directory, Staging Area, dan Commit

- Working directory: berkas yang diedit.
- Staging area: berkas yang dipilih melalui `git add`.
- Commit: snapshot permanen yang tersimpan dalam riwayat Git.

## Branch dan Penggabungan

Branch `fitur-menu` berisi menu utama dan operasi dasar. Setelah diuji, branch digabungkan ke `main`. Branch `fitur-pengelolaan` menambah hapus, filter, dan statistik, lalu juga digabungkan ke `main`.

## Masalah dan Perbaikan

Record berkas rusak berpotensi menghentikan pemuatan. Perbaikannya adalah memvalidasi jumlah bagian dan konversi Boolean, lalu melewati baris yang tidak valid. Pengujian ulang memastikan aplikasi tetap terbuka.

## Kualitas README

README mencakup latar belakang, pengguna, fitur, struktur, cara menjalankan, pengujian, pembagian branch, keterbatasan, dan tautan repository.

## Dua Keterampilan Sudah Dikuasai

- Mengelola riwayat commit dan branch Git.
- Membuat aplikasi Kotlin dengan Collection, berkas, dan validasi.

## Dua Keterampilan Perlu Ditingkatkan

- Menangani konflik merge nyata dalam kerja kelompok.
- Menggunakan pull request dan review kode GitHub.
