package day70coding;
import java.util.Scanner;
public class Day70Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkann Panjang: ");
        int p = sc.nextInt();
        System.out.print("Masukkan Lebar: ");
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("* "); 
            }
            System.out.println();
        }
    }  
}
