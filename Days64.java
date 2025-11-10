package day50coding;
import java.util.Scanner;
public class day64Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai M: ");
        int m = sc.nextInt();
        System.out.print("Masukkan Nilai N: ");
        int n = sc.nextInt();
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
           hasil *= m;
        }
        System.out.println(m+" Pangkat "+ n + " adalah "+ hasil);
    }
}
