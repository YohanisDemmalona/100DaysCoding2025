package day50coding;
import java.util.Scanner;
public class day58Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        System.out.println("Angka 1 Sampai N: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nAngka N Sampai 1: ");
        for (int i = N  ; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
