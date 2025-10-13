//HelloOOP
class mahasiswa{
    String nama;
    String nim;

    public mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    void sapa(){
        System.out.println("Hello POS World, I am " +nama + "-" +nim);
    }
}
class Produk{
    String namaProduk;
    int harga;

    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
}
public class HelloOOP {
    public static void main(String[] args) {
        mahasiswa m = new mahasiswa("Dian  Nur Safitri", "240320563");
        m.sapa();
        Produk[] daftar = {
         new Produk("Bibit Anggur", 25000),
         new Produk("Bibit Melon", 350000),
         new Produk("Bibit Semangka", 25000)
        };
        int total = 0;
        System.out.println("Daftar Produk:");
        for (Produk p : daftar) {
            System.out.println("- " + p.namaProduk + ": " + p.harga);
            total += p.harga;
      }
      System.out.println("Total harga semua produk: " + total);
      
    }
}