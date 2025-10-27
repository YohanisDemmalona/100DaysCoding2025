package day50coding;
import java.util.Scanner;
public class Day50Coding {
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       System.out.print("Masukkan angka: "); 
       int angka = sc.nextInt();      
       String bilangan = (angka%2==0) ? "Genap" : "Ganjil";
       System.out.println(angka + " Adalah Angka " + bilangan);
    }   
}
