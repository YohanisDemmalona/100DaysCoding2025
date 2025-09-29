package day22coding;
import java.util.Scanner;
public class Day22Coding {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = sc.nextDouble();
        double luas = sisi * sisi;
        System.out.println("Luas persegi adalah: " + luas);

    }   
}
