Nama  : Danial Hirzan Akbary

NIM   : 2409116098

# Manajemen Koleksi Mainan

## Deskripsi Program
Program Java ini merupakan aplikasi manajemen koleksi mainan berbasis PBO. Program dapat menambahkan, melihat, mengubah, dan menghapus koleksi mainan, baik Action Figure maupun Diecast Mobil. Setiap mainan memiliki atribut seperti nama, merek, harga, kategori, dan edisi. Untuk Diecast Mobil, ada tambahan atribut skala; untuk Action Figure, ada atribut karakter.  

Program ini juga menerapkan konsep PBO lanjutan, yaitu abstraction melalui abstract class dan interface, serta polymorphism melalui overloading dan overriding method.

## Alur Program
Program dijalankan melalui MainApp.java, kemudian menampilkan menu utama dengan pilihan untuk menambah mainan, melihat koleksi mainan, mengubah mainan, menghapus mainan, atau keluar dari program. User memilih menu sesuai dengan kebutuhan.

<img width="457" height="194" alt="image" src="https://github.com/user-attachments/assets/ff1531cb-d6c3-4d8a-bf4f-d5bd28467e82" />


Jika user memilih menambah mainan, program akan meminta jenis mainan, apakah Action Figure atau Diecast Mobil. Selanjutnya user diminta memasukkan nama, merek, harga, dan kategori mainan. User juga memilih edisi mainan dari opsi Standar, Limited, atau Exclusive. Untuk Action Figure, user memasukkan karakter dari mainan tersebut, sedangkan untuk Diecast Mobil, user memilih skala mainan, misalnya 1:18, 1:24, atau 1:32. Data yang dimasukkan kemudian disimpan melalui MainanService.

<img width="658" height="281" alt="image" src="https://github.com/user-attachments/assets/4c862946-92e7-4f47-a346-7aeaf99b2d98" />


Apabila user memilih untuk melihat koleksi mainan, program menampilkan daftar semua mainan yang tersimpan. Informasi yang ditampilkan lengkap sesuai dengan jenis mainan. Action Figure menampilkan nama, merek, harga, kategori, edisi, dan karakter, sedangkan Diecast Mobil menampilkan nama, merek, harga, kategori, edisi, dan skala.

<img width="570" height="314" alt="image" src="https://github.com/user-attachments/assets/94cf7b3b-1478-47b3-b1e7-173f9bd468e0" />


Jika user ingin mengubah mainan, program akan menampilkan daftar mainan dengan index masing-masing. User memilih index mainan yang ingin diubah, kemudian memasukkan jenis mainan baru beserta data lengkapnya sesuai jenis mainan. Data lama diganti dengan data baru menggunakan method updateMainan() dari MainanService.

<img width="786" height="612" alt="image" src="https://github.com/user-attachments/assets/ee8d4242-ba3c-4cfe-a65c-9d6d9eaf5697" />


Untuk menghapus mainan, program menampilkan daftar mainan dengan index. User memasukkan index mainan yang ingin dihapus, dan mainan tersebut dihapus melalui method hapusMainan() di MainanService.

<img width="599" height="363" alt="image" src="https://github.com/user-attachments/assets/a8e23b14-b523-49dc-9eba-ec28aff18c23" />


Jika user memilih keluar, program berhenti dijalankan.

<img width="890" height="211" alt="image" src="https://github.com/user-attachments/assets/bfefb3f9-770e-4a94-a9a6-e8cd2c363df3" />


## Penerapan Abstraction
<pre> Program menerapkan abstraction melalui abstract class dan interface.  
- Abstract class `Mainan.java` menjadi class dasar untuk semua mainan, dengan atribut `nama` dan `harga` serta abstract method `tampilkanInfo()` yang harus diimplementasikan oleh subclass.  

  <img width="591" height="726" alt="image" src="https://github.com/user-attachments/assets/17d5a97d-bfbe-49e3-a2fa-3d6b335c6525" />


  <img width="781" height="124" alt="image" src="https://github.com/user-attachments/assets/1303aff7-f1d7-4ba1-8fa0-93a0d85e2781" />


- Abstract class `MainanKoleksi.java` adalah turunan dari `Mainan`, menambahkan atribut `merek`, `kategori`, dan `edisi`, serta mengimplementasikan interface `TampilkanKategori.java`.  

  <img width="1286" height="380" alt="image" src="https://github.com/user-attachments/assets/f8529cbd-cebf-4fa2-8671-c518b713c91e" />

  <img width="744" height="140" alt="image" src="https://github.com/user-attachments/assets/93887265-7877-444b-809e-976a67df22d9" />

  
- Interface `TampilkanKategori.java` mendefinisikan method `tampilkanKategori()` yang digunakan untuk menampilkan kategori mainan pada setiap subclass MainanKoleksi.</pre>

  <img width="558" height="213" alt="image" src="https://github.com/user-attachments/assets/5e80010c-c305-450a-b6d5-7edbdd7955e1" />


## Penerapan Polymorphism
Program menerapkan polymorphism dalam dua bentuk: overriding dan overloading.  

<pre> - **Overriding:** Method `tampilkanInfo()` di `Mainan` di-override oleh `MainanKoleksi`, kemudian di-override lagi oleh `ActionFigure` dan `DiecastMobil` untuk menampilkan informasi tambahan sesuai jenis mainan (karakter atau skala).  

- **Overloading:** Method `tambahMainan()` di `MainanService` memiliki dua versi, yaitu `tambahMainan(Mainan mainan)` dan `tambahMainan(Mainan mainan, boolean cetakInfo)`. Versi kedua menambahkan opsi untuk langsung menampilkan info mainan saat menambah data.</pre>


  <img width="1067" height="680" alt="image" src="https://github.com/user-attachments/assets/df7a5cbc-05dc-4f66-ba83-ab6435dff36d" />
