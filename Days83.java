package day70coding;
import java.util.Scanner;
public class day83Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] angka = new int[5];
        int jumlah = 0;

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        System.out.println("Jumlah angka yang Anda masukkan: " + jumlah);
    }
}
