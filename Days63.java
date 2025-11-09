package day50coding;
import java.util.Scanner;
public class day63Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N: ");
        int N = sc.nextInt();
        long total = 1;
        for (int i = 1; i <= N; i++) {
           total *= i;
        }
        System.out.println("Total dari 1-N adalah: "+total);
    }
}
