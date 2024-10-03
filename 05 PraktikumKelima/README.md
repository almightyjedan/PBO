LAPORAN PRAKTIKUM PEMROGRAMAN BEORIENTASI OBJEK
“Tugas 05 - Abstract dan Interface”

![image](https://upload.wikimedia.org/wikipedia/id/4/46/Logo_Universitas_Pancasila.png)

Oleh:
Nama	: Muhammad Zaidan Ahbab
NPM	: 4523210081
Class	: A

Dosen:
Adi Wahyu Pribadi , S.Si., M.Kom

S1-Teknik Informatika 
Fakultas Teknik Universitas Pancasila 
2024

1.	Abstract Class Animal
   ![image](https://github.com/user-attachments/assets/6ac6dac0-ed42-42c6-b12e-ff084d3975c1)
  	Animal adalah class abstrak dengan atribut legs, konstruktor untuk menginisialisasi kaki, methods berjalan (walk()), dan methods abstrak makan (eat()) yang harus diimplementasikan oleh subclass.

2.	Interface Pet
   ![image](https://github.com/user-attachments/assets/01890294-ea14-4cb3-8721-9467a3f11b60)
  	Interface Pet mendefinisikan tiga methods: getName(), setName(), dan play(), yang harus diimplementasikan oleh class yang menggunakannya.

3.	Spider
   ![image](https://github.com/user-attachments/assets/249dc2b7-6816-4789-a452-8b73da8328a0)
  	Spider adalah subclass Animal dengan 8 kaki dan mengimplementasikan methods eat() untuk menampilkan pesan laba-laba makan serangga.

4.	Dog
   ![image](https://github.com/user-attachments/assets/98156278-410d-4769-913a-b732b914adf3)
  	Dog adalah subclass Animal yang mengimplementasikan Pet. Anjing memiliki 4 kaki, atribut nama, dan methods setName(), getName(), serta play() yang menampilkan pesan anjing bermain tangkap stik. Methods eat() menampilkan pesan anjing makan daging, dan walk() di-override untuk menunjukkan anjing berjalan dengan tuannya.

5.	Cat
   ![image](https://github.com/user-attachments/assets/52fd54cc-fa10-4c16-beb9-58afe15ebc3d)
  	Cat adalah subclass Animal yang mengimplementasikan Pet. Kucing memiliki 4 kaki, atribut nama, dan dua konstruktor (dengan atau tanpa nama). Methods setName(), getName(), dan play() menampilkan pesan kucing bermain bola kecil. Methods eat() menampilkan pesan kucing makan ikan.

6.	Implementasi
   
1.	Buat objek Spider, nama bebas
2.	Objek Spider → eat()
3.	Buat objek Dog, nama bebas
4.	Kasih nama anjingnya bebas
5.	Tampilkan objek namanya
6.	Objek dog play()
7.	Objek dog eat()
8.	Objek dog walk()
9.	Buat object Cat, nama bebas dan sekaligus pakai constructor yang ada set namanya
10.	Tampilkan objek kucing namanya
11.	Object Cat play()
12.	Object Cat eat()
13.	Object Cat walk()

![image](https://github.com/user-attachments/assets/6c3111ce-b8b9-445b-8501-0adffe62a3bc)

KESIMPULAN
Class Animal adalah class abstrak dengan atribut dan methods dasar yang digunakan oleh berbagai subclass seperti Laba-laba, Anjing, Kucing, dll. Class ini mengimplementasikan methods Eat() abstrak  dengan cara yang sesuai dengan properti masing-masing hewan. Interface Pet menambahkan methods untuk mengelola nama dan aktivitas permainan yang diterapkan oleh class Anjing dan Kucing. Dengan demikian, sistem ini mendukung pewarisan hierarki  dan polimorfisme, di mana setiap class memiliki perilaku spesifik sambil mengikuti konvensi yang ditetapkan oleh superclass dan antarmukanya.

