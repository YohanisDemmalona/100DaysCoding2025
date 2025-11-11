package day50coding;
import java.util.Scanner;
public class day65Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukka Nilai N: ");
        int n = sc.nextInt();
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }
        System.out.println("Faktorial dari " + n + " adalah " + hasil); 
    }
}
