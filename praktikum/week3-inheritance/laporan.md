# Laporan Praktikum Minggu 3
Topik: Inheritance

## Identitas
- Nama  : [Dian Nur Safitri]
- NIM   : [240320563]
- Kelas : [3DSRA]

---

## Tujuan
1. Mahasiswa mampu menjelaskan konsep inheritance (pewarisan class) dalam OOP.
2. Mahasiswa mampu membuat superclass dan subclass untuk produk pertanian.
3. Mahasiswa mampu mendemonstrasikan hierarki class menggunakan super.
4. Mahasiswa mampu memahami keuntungan inheritance dibanding penggunaan class tunggal.
---

## Dasar Teori
1. Inheritance adalah mekanisme pewarisan atribut dan method dari satu class ke class lainnya.
2. Superclass (induk) adalah class yang berisi atribut dan perilaku umum.
3. Subclass (turunan) mewarisi atribut dan method dari superclass, serta dapat menambah atribut baru.
4. Keyword super digunakan untuk memanggil konstruktor atau method dari superclass.
5. Inheritance membantu mengurangi duplikasi kode dan meningkatkan reusability dalam OOP.

---

## Langkah Praktikum
1. Membuat struktur proyek sesuai panduan di folder week3-inheritance.
2. Membuat Produk.java sebagai superclass dengan atribut umum (kode, nama, harga, stok).
3. Membuat tiga subclass:
    Benih → atribut tambahan varietas
    Pupuk → atribut tambahan jenis
    AlatPertanian → atribut tambahan material
4. Membuat MainInheritance.java untuk menguji pewarisan class.
5. Menambahkan class CreditBy untuk menampilkan identitas mahasiswa.
6. Melakukan commit & push ke GitHub dengan pesan: week3-inheritance.
---

## Kode Program
```java

// produk
package model;

public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }
}

//benih
package model;

public class Benih extends Produk {
    private String varietas;

    public Benih(String kode, String nama, double harga, int stok, String varietas) {
        super(kode, nama, harga, stok);
        this.varietas = varietas;
    }

    public String getVarietas() { return varietas; }
    public void setVarietas(String varietas) { this.varietas = varietas; }
}

//pupuk
package model;

public class Pupuk extends Produk {
    private String jenis;

    public Pupuk(String kode, String nama, double harga, int stok, String jenis) {
        super(kode, nama, harga, stok);
        this.jenis = jenis;
    }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }
}

//alatpertanian
package model;

public class AlatPertanian extends Produk {
    private String bahan;

    public AlatPertanian(String kode, String nama, double harga, int stok, String bahan) {
        super(kode, nama, harga, stok);
        this.bahan = bahan;
    }

    public String getBahan() { return bahan; }
    public void setBahan(String bahan) { this.bahan = bahan; }
}

//maininheritance

import model.*;
import util.*;

public class MainInheritance {
    public static void main(String[] args) {
        Benih b = new Benih("BNH-001", "Benih Padi IR64", 25000, 100, "IR64");
        Pupuk p = new Pupuk("PPK-101", "Pupuk Urea", 350000, 40, "Urea");
        AlatPertanian a = new AlatPertanian("ALT-501", "Cangkul Baja", 90000, 15, "Baja");

        System.out.println("Benih: " + b.getNama() + ", Varietas: " + b.getVarietas());
        System.out.println("Pupuk: " + p.getNama() + ", Jenis: " + p.getJenis());
        System.out.println("Alat Pertanian: " + a.getNama() + ", Bahan: " + a.getBahan());

        CreditBy.tampilkan("Dian Nur Safitri", "240320563");
    }
}

---
```

## Hasil Eksekusi
(![Screenshot hasil week3](screenshots\MainInheritance.png))
https://github.com/diannursafitrii08-byte/oop-202501-240320563/blob/main/praktikum/week3-inheritance/screenshots/MainInheritance.png
---

## Analisis
1. Pada program ini, class Produk menjadi superclass yang berisi atribut umum semua produk.
2. Class Benih, Pupuk, dan AlatPertanian mewarisi atribut dan method dari Produk, serta menambahkan atribut spesifik masing-masing.
3. Penggunaan super() di konstruktor subclass memastikan atribut dari superclass diinisialisasi dengan benar.
4. Dibanding minggu sebelumnya (tanpa inheritance), pendekatan ini lebih efisien karena tidak perlu menulis ulang atribut kode, nama, harga, dan stok di setiap class.
5. Kendala yang sempat muncul adalah error pada package dan karakter aneh , yang diatasi dengan memperbaiki struktur folder dan mengetik ulang kode di VSCode.
---

## Kesimpulan
1. Konsep inheritance memungkinkan pembuatan kode yang lebih ringkas, terstruktur, dan mudah dipelihara.
2. Dengan inheritance, class turunan dapat memanfaatkan kembali atribut dan method dari class induk.
3. Program berhasil menampilkan data dari setiap subclass serta memanggil method superclass menggunakan super().

---

## Quiz
1. Apa keuntungan menggunakan inheritance dibanding membuat class terpisah tanpa hubungan?
**Jawaban:** Inheritance mengurangi duplikasi kode, membuat struktur program lebih rapi, dan memudahkan pemeliharaan.
2. Bagaimana cara subclass memanggil konstruktor superclass?
**Jawaban:** Dengan menggunakan keyword super(parameter) di dalam konstruktor subclass.
3. Berikan contoh kasus di POS pertanian selain Benih, Pupuk, dan Alat Pertanian yang bisa dijadikan subclass.
**Jawaban:** Misalnya class ObatTanaman (mewarisi Produk) dengan atribut tambahan kandunganAktif.
