package day50coding;
import java.util.Scanner;
public class day59Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N: ");
        int N = sc.nextInt();
        
        System.out.println("Angka ganjil 1 hingga N:");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nAngka genap 1 hingga N:");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
