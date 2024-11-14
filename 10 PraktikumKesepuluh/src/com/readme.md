<h1>MUHAMMAD ZAIDAN AHBAB 4523210081</h1>

<h2>Account.java</h2>

![image](https://github.com/user-attachments/assets/5fafc1bb-8106-4d6a-8ef2-b673a17cfc7c)
Class Account ini memiliki atribut accountNumber, pin, dan balance, dengan konstanta MINIMUM_BALANCE sebesar 50,000 sebagai saldo minimum. Constructor Account digunakan untuk menginisialisasi nomor akun, PIN, dan saldo awal. Method changePin memungkinkan pengguna untuk mengubah PIN, dengan validasi PIN lama dan pengecekan kesesuaian PIN baru. Method credit untuk menambah saldo dan debit untuk mengurangi saldo, serta menyediakan getter untuk mengakses nomor akun, PIN, dan saldo.


<h2>Deposit.java</h2>

![image](https://github.com/user-attachments/assets/5f396692-59a6-462f-9501-5eb0df85697e)
Class Deposit merupakan turunan dari kelas Transaction, digunakan untuk melakukan deposit. Constructor Deposit menerima objek Account sebagai parameter. Method execute yang di-override berfungsi untuk meminta input jumlah deposit dari pengguna, menambah jumlah tersebut ke saldo akun menggunakan metode credit dari Account, dan menampilkan saldo terbaru setelah transaksi berhasil dilakukan.


<h2>Transaction.java</h2>

![image](https://github.com/user-attachments/assets/ac948680-bfef-484c-ab6a-3c2c638ebd6e)
Class Transaction berfungsi sebagai class induk bagi berbagai jenis transaksi, seperti deposit dan penarikan, yang akan dilakukan pada objek Account. Class ini memiliki atribut account yang bertipe Account. Method execute dideklarasikan sebagai method abstract.


<h2>Transfer.java</h2>

![image](https://github.com/user-attachments/assets/2b7ebd31-f8a6-4616-94be-6338bf7900f8)
Class Transfer memungkinkan pengguna untuk mentransfer dana dari satu akun ke akun lain. Konstructor Transfer menerima dua objek yaitu akun sumber dan akun tujuan. Method execute meminta pengguna memasukkan jumlah transfer, lalu memeriksa apakah saldo di akun sumber mencukupi. Jika mencukupi, saldo akan dikurangi. Jika saldo tidak mencukupi, pesan kesalahan ditampilkan.


<h2>Withdrawal.java</h2>

![image](https://github.com/user-attachments/assets/ecdc53ac-51df-42f6-ad81-1c80cfdb6af4)
Class Withdrawal digunakan untuk melakukan transaksi penarikan dana. Constructor Withdrawal menerima objek Account. Method execute meminta input jumlah penarikan dari pengguna dan memeriksa apakah saldo akun setelah penarikan tidak kurang dari saldo minimum (MINIMUM_BALANCE sebesar 50,000). Jika tidak memenuhi saldo minimum, pesan kesalahan ditampilkan. Jika saldo mencukupi, saldo akan dikurangi dengan metode debit, dan saldo terbaru ditampilkan.


<h2>ATM.java</h2>

![image](https://github.com/user-attachments/assets/89f94916-dfa0-447d-8169-777e403a5a60)
![image](https://github.com/user-attachments/assets/b8742c8e-27bb-47b1-add1-aaddd24b020f)
Class ATM menggunakan Method initializeAccounts untuk menambahkan akun contoh ke dalam Map. Method start memulai sesi ATM dengan meminta nomor akun dan PIN dari pengguna untuk autentikasi. Jika autentikasi berhasil, pengguna diarahkan ke menu utama. Pada showMenu, class Transaction dan class turunannya diinisialisasi dan method execute dipanggil untuk melaksanakan transaksi. Jika pengguna memilih "Ubah PIN," kelas Account digunakan untuk mengubah PIN setelah validasi.


<h2>Main.java</h2>

![image](https://github.com/user-attachments/assets/d1bfcc0f-c52c-4542-80a4-e8ec0921640d)
Class Main berfungsi sebagai awal mula program ATM. Dalam method main, objek ATM dibuat, lalu method start dipanggil.
