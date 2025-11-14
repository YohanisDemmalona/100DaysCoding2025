package day50coding;
import java.util.Scanner;
public class day68Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Ukuran Persegi: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}
