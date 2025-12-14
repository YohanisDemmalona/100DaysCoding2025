package day70coding;
import java.util.Scanner;
public class day98Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Batas: ");
        int batas = sc.nextInt();
        
        int a = 0;
        int b = 1;
        
        System.out.print("Deretan Fibonacci: ");
        System.out.print(a + " " + b + " ");
        
        for (int i = 1; i <= batas; i++) {
            int c = a + b;
            System.out.print(c +" ");
            a = b;
            b = c;
        }
    }
}
