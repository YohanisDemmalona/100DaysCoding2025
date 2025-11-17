package day70coding;
import java.util.Scanner;
public class day71Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tinggi segi tiga: ");
        int tinggi = sc.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
