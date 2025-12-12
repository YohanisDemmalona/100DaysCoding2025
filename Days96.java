package day70coding;
import java.util.Scanner;
public class day96Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka Pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka Kedua: ");
        int b = sc.nextInt();
        
        System.out.println("hasil Penjumlahan: "+ penjumlahan(a, b));
        System.out.println("hasil pengurangan: "+ pengurangan(a, b));
        System.out.println("hasil perkalian: "+ perkalian(a, b));
        System.out.println("hasil pembagian: "+ pembagian(a, b));
    }
    static int penjumlahan(int q, int w){
        return q + w;
    }
    static int pengurangan(int w, int e){
        return w - e;
    }
    static int perkalian(int e, int r){
        return e * r;
    }
    static int pembagian(int r, int t){
        return r / t;
    }
}
