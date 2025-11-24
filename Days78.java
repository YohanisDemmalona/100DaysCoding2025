package day70coding;
import java.util.Scanner;
public class day78Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan sebuah string: ");
        String input = sc.nextLine();
        String uppercase = input.toUpperCase();
        System.out.println("String uppercase: " + uppercase);

        System.out.print("Masukkan sebuah string: ");
        String b = sc.nextLine();
        int panjang = b.length();
        System.out.println("Panjang string: " + panjang);

    }
}
