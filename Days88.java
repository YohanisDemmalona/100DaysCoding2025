package day70coding;
import java.util.Scanner;
public class day88Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Panjang Array: ");
        int angka = sc.nextInt();
        
        int [] Array = new int[angka];
        System.out.println("Masukkan Elemen Array: ");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        for (int i : Array) {
            System.out.print(i+" "); 
        }
    }
}
