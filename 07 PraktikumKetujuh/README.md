<h1>LAPORAN PRAKTIKUM PEMROGRAMAN BEORIENTASI OBJEK</h1>
“Tugas 07 – Inner Class”

![image](https://github.com/user-attachments/assets/c21f2029-a879-43af-b7a7-89491c8b92e8)

Oleh  :

Nama  : Muhammad Zaidan Ahbab

NPM   : 4523210081

Class : A

Dosen : Adi Wahyu Pribadi , S.Si., M.Kom



S1-Teknik Informatika 

Fakultas Teknik Universitas Pancasila 

2024

<h1>Latihan 1</h1>

![image](https://github.com/user-attachments/assets/02daea4e-030e-4e87-b21e-f51972b5e764)
 
Kelas Luar memiliki atribut privat outerVariable yang diinisialisasi dengan nilai "Variabel luar". Di dalam kelas ini, ada kelas inner bernama Dalam, yang memiliki atribut innerVariable dengan nilai "Variabel dalam", dan method bicara yang mencetak isi variabel outerVariable dan innerVariable.
Kelas Dalam adalah inner class dari kelas Luar. Karena berada di dalam kelas Luar, kelas Dalam dapat mengakses semua atribut dan metode milik Luar, termasuk atribut outerVariable meskipun atribut ini bersifat privat.
Di dalam class App, Objek Luar bernama l dibuat. Objek inner class Dalam bernama d dibuat melalui objek l (karena inner class membutuhkan instance dari outer class untuk diakses). Method bicara() dipanggil pada objek d.
Jadi, program akan mencetak innerVariable dari kelas Dalam, yaitu "Variabel dalam". Kemudian, program akan mencetak outerVariable dari kelas Luar, yaitu "Variabel luar".

<h1>Latihan 2</h1>

![image](https://github.com/user-attachments/assets/ba822435-32c4-41a0-b70d-3f6d4ab2c83f)

Class Mouter memiliki variabel private `m`, yang diinisialisasi dengan nilai random menggunakan package `Math.random()` yang menghasilkan angka acak antara 0 dan 100.
Method go memiliki dua parameter, `x` dan `y`. Parameter `y` dideklarasikan sebagai `final`, artinya nilainya tidak dapat diubah setelah diinisialisasi.
Variabel Lokal dalam Metode `go()` berisikan, variabel `a` adalah hasil penjumlahan dari `x + y`. dan variabel `b` adalah hasil pengurangan dari `x - y`, dan karena variabel `b` dideklarasikan sebagai `final`, maka nilainya tetap sama setelah diinisialisasi.
Inner class `Minner` didefinisikan secara lokal di dalam method `go()`. Karena inner class ini ada di dalam method yang hanya dapat diakses dari dalam metode tersebut.
Program memanggil metode `main()`, kemudian memanggil metode `go()`. Nilai `x` dan `y` dipilih secara acak dengan menggunakan `Math.random()`.
-	Nilai `m`	: Dihasilkan secara acak di dalam konstruktor `MOuter`. Setiap kali program dijalankan, nilai ini bisa berbeda.
-	Nilai `x` dan `y`	: Nilai-nilai ini juga dihasilkan secara acak ketika metode `go()` dipanggil, jadi mereka akan berbeda setiap kali program dijalankan.
-	Nilai `a` dan `b`	: Dihasilkan dari operasi aritmatika sederhana menggunakan `x` dan `y`, yaitu : `a = x + y` dan `b = x - y`

<h1>Latihan 3</h1>

-	Kelebihan inner class terutama berkaitan dengan struktur kode yang lebih rapi, keterkaitan yang kuat dengan outer class, dan kemudahan dalam akses data dan event handling, terutama dalam pengembangan GUI.

-	Kelemahan inner class terkait dengan potensi membuat kode lebih rumit, masalah kinerja, dan keterbatasan dalam penggunaan ulang, yang dapat membuat pengelolaan kode lebih menantang jika tidak digunakan dengan bijak.

<h1>Latihan 4</h1>
Run semua contoh yang ada di Pertemuan hari ini (Delapan UTS)

![image](https://github.com/user-attachments/assets/b081d601-37b7-4d6d-9ad2-cd8f1d4f4359)

![image](https://github.com/user-attachments/assets/ba94da2c-1c4c-4111-b14c-408f534d0147)
