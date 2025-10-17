package day40coding;
import java.util.Scanner;
public class Day40Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Pilih operasi (1/2/3/4): ");
        int pilihan = sc.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double angka1 = sc.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = sc.nextDouble();

        if (pilihan == 1) {
            double hasil = angka1 + angka2;
            System.out.println("Hasil penjumlahan: " + hasil);
        } else if (pilihan == 2) {
            double hasil = angka1 - angka2;
            System.out.println("Hasil pengurangan: " + hasil);
        } else if (pilihan == 3) {
            double hasil = angka1 * angka2;
            System.out.println("Hasil perkalian: " + hasil);
        } else if (pilihan == 4) {
            if (angka2 != 0) {
                double hasil = angka1 / angka2;
                System.out.println("Hasil pembagian: " + hasil);
            } else {
                System.out.println("Error: Pembagian dengan nol!");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}
