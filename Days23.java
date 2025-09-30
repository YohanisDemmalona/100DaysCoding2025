package day23coding;
import java.util.Scanner;
public class Day23Coding {
    public static void main(String[] args) {
       Scanner sc =new Scanner (System.in);
       
        System.out.print("Masukkan Panjang: ");
        double panjang =sc.nextDouble();
        
        System.out.print("Masukkan Lebar: ");
        double lebar =sc.nextDouble();
        
        double luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang adalah: "+luas);
    } 
}
