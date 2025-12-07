package day70coding;
import java.util.Scanner;
public class day91Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
       
        System.out.print("Masukkan Panjang: ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan Lebar: ");
        int lebar = sc.nextInt();
        int Luas = luas(panjang, lebar);//(panjang, lebar) ini adalah parameter
        System.out.println("Luas Persegi Panjang : "+ Luas);
    
    }
     static int luas(int panjang, int lebar){
       return panjang * lebar;
    }
}
