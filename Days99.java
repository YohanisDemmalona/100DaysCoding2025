package day70coding;
import java.util.Scanner;
public class day99Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N: ");
        int n = sc.nextInt();
        System.out.println("Bilangan prima 1 sampai "+n+":");
        for (int i = 2; i <= n; i++) {
            boolean prima = true;
            for (int j = 2; j*j <= i; j++) {
                if(i%j == 0){
                    prima = false;
                }
            }
            if(prima){
                System.out.print(i+ " ");
            }
        }
    }
}
