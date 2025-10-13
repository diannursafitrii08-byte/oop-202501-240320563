//HelloProcedural
public class HelloProcedural {
     public static void main(String[] args) {
        String nama = "Dian Nur Safitri";
        String nim = "240320563";
        String[] produk = {"Bibit Anggur", "Bibit Melon", "Bibit Semangka"};
        int[] harga = {25000, 350000, 25000};
        int total = 0;
        System.out.println("Hello POS World, I am " +nama + "-" +nim);
        System.out.println("Daftar Produk: ");
        for (int i = 0; i < produk.length; i++){
            System.out.println("- " +produk[i] + ": " +harga[i]);
            total += harga[i];
        }
        System.out.println("Total harga semua produk: " +total);
    }
}