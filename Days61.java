package day50coding;
import java.util.Scanner;
public class day61Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
        System.out.print("Masukkan nilai M: ");
        int M = sc.nextInt();

        System.out.println("Bilangan kelipatan " + M + " dari 1 hingga " + N + ":");
        for (int i = M; i <= N; i += M) {
            System.out.print(i + " \n");
        }
 
    }
}
