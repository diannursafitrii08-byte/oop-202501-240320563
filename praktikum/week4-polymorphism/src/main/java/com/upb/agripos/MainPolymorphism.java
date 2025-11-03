import model.*;
import util.*;

public class MainPolymorphism {
    public static void main(String[] args) {
        // Dynamic binding: semua disimpan sebagai Produk
        Produk[] daftarProduk = {
            new Benih("BNH-001", "Benih Padi IR64", 25000, 100, "IR64"),
            new Pupuk("PPK-101", "Pupuk Urea 50kg", 350000, 40, "Urea"),
            new AlatPertanian("ALT-501", "Cangkul Baja", 90000, 15, "Baja")
        };

        System.out.println("=== Daftar Produk (Polymorphism) ===");
        for (Produk p : daftarProduk) {
            System.out.println(p.getInfo());
        }

        // Overloading
        System.out.println("\n=== Contoh Overloading ===");
        Produk benih = new Benih("BNH-002", "Benih Jagung Hibrida", 20000, 50, "Bisi-18");
        benih.tambahStok(10);      // int
        benih.tambahStok(5.5);     // double
        System.out.println(benih.getInfo());

        CreditBy.tampilkan("Dian Nur Safitri", "240320563");
    }
}
