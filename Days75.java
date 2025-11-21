package day70coding;
import java.util.Scanner;
public class day75Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        System.out.println("Panjang nama: " + nama.length());
        System.out.println("Nama dalam uppercase: " + nama.toUpperCase());
        System.out.println("Nama dalam lowercase: " + nama.toLowerCase());
    }
}
