package day70coding;
import java.util.Scanner;
public class day72Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tinggi: ");
        int tinggi = sc.nextInt();
        for (int i = tinggi; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
