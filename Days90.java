package day70coding;
import java.util.Scanner;
public class day90Coding {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Masukkan panjang: ");
         int panjang = sc.nextInt();
         System.out.print("Masukkan Lebar: ");
         int lebar = sc.nextInt();
         
         int luas = HitungLuas(panjang, lebar);
         System.out.println("Luas Persegi Panjang Adalah: "+luas);
    }
     public static int HitungLuas(int panjang, int lebar){
         return panjang*lebar;
     }
}
