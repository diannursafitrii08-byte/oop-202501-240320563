//HelloFunctional
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class HelloFunctional {
    public static void main(String[] args) {
        String nim = "240320563";
        String nama = "Dian Nur Safitri";
        List<String> produk = Arrays.asList("Benih Anggur", "Benih Melon", "Benih Semangka");
        List<Integer> harga = Arrays.asList(25000, 350000, 25000);
        System.out.println("Hello POS World");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Daftar Produk:");
        IntStream.range(0, produk.size())
            .forEach(i -> System.out.println("- " + produk.get(i) + ": " + harga.get(i)));
        int total = harga.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total harga semua produk: " + total);
   
    }
}