# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Atlet menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan id Atlet, dan memberikan output berupa informasi detail dari id tersebut seperti tahun lahir, cabor, prestasi juara, dan nomor induk.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Atlet`, `AtletDetail`, dan `AtletBeraksi` adalah contoh dari class.

```bash
public class Atlet {
    ...
}

public class AtletDetail extends Atlet {
    ...
}

public class AtletBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `alt[i] = new AtletDetail(nama, id);` adalah contoh pembuatan object.

```bash
alt[i] = new AtletDetail(nama, id;
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `id` adalah contoh atribut.

```bash
String nama;
String id;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Atlet` dan `AtletDetail`.

```bash
public Atlet(String nama, String id) {
    this.nama = nama;
    this.id = id;
}

public AtletDetail(String nama, String id) {
    super(nama, id);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setId` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setId(String id) {
    this.id = id;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getid`, `getTahunLahir`, `getCabor`, `getPrestasiJuara`, dan `getNoInduk` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getID() {
    return id;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `id` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String id;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `AtletDetail` mewarisi `Atlet` dengan sintaks `extends`.

```bash
public class AtletDetail extends Atlet {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `AtletDetail` merupakan override dari method `displayInfo` di `Atlet`.

```bash
public String displayInfo(String Jeka) {
    return displayInfo() + "\nJeka: " + Jeka;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getPrestasiJuara` dan seleksi `switch` dalam method `getCabor`.

```bash
// Metode untuk mendapatkan tahun lahir dari ID
    public Integer getTahunLahir() {
        return Integer.parseInt(getId().substring(2, 4)) + 2000;
    }

    // Metode untuk mendapatkan jenis cabang olahraga (cabor) dari ID
    public String getJenisCabor() {
        String kodeCabor = getId().substring(2, 4);
        switch (kodeCabor) {
            case "01":
                return "Cabor Bola Basket";
            case "02":
                return "Cabor Sepak Bola";
            case "03":
                return "Cabor Renang";
            case "04":
                return "Cabor Atletik";
            default:
                return "Cabor lain";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < atletDetails.length; i++) {
            System.out.println("Informasi Atlet ke-" + (i + 1) + ":");
            System.out.println(atletDetails[i].displayInfo());
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
 Scanner scanner = new Scanner(System.in);

        // Array objek AtletDetail
        AtletDetail[] atletDetails = new AtletDetail[2];

        // Loop untuk menginput detail dua objek AtletDetail
        for (int i = 0; i < atletDetails.length; i++) {
            System.out.print("Masukan nama Atlet ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();
            String id = "";
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `AtletDetail[] Atlet = new AtletDetail[2];` adalah contoh penggunaan array.

```bash
  AtletDetail[] atletDetails = new AtletDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bas
while (true) {
                try {
                    System.out.print("Masukan Id Atlet ke-" + (i + 1) + ": ");
                    id = scanner.nextLine();
                    validateId(id);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Id tidak valid. Harap masukkan id yang benar.");
                } catch (InvalidIdFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Almas Syauqannanda
NPM: 2210010479
