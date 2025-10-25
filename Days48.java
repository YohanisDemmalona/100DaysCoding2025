package day40coding;
import java.util.Scanner;
public class day48Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int pilihan;
        double a, b, hasil;

        System.out.println("=== MENU OPERASI ARITMATIKA ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulu/Sisa Bagi");
        System.out.print("Masukkan pilihan (1-5): ");
        pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan bilangan pertama: ");
                a = sc.nextDouble();
                System.out.print("Masukkan bilangan kedua: ");
                b = sc.nextDouble();
                hasil = a + b;
                System.out.println("Hasil penjumlahan = " + hasil);
                break;

            case 2:
                System.out.print("Masukkan bilangan pertama: ");
                a = sc.nextDouble();
                System.out.print("Masukkan bilangan kedua: ");
                b = sc.nextDouble();
                hasil = a - b;
                System.out.println("Hasil pengurangan = " + hasil);
                break;

            case 3:
                System.out.print("Masukkan bilangan pertama: ");
                a = sc.nextDouble();
                System.out.print("Masukkan bilangan kedua: ");
                b = sc.nextDouble();
                hasil = a * b;
                System.out.println("Hasil perkalian = " + hasil);
                break;

            case 4:
                System.out.print("Masukkan bilangan pertama: ");
                a = sc.nextDouble();
                System.out.print("Masukkan bilangan kedua: ");
                b = sc.nextDouble();
                hasil = a / b;
                System.out.println("Hasil pembagian = " + hasil);
                break;

            case 5:
                System.out.print("Masukkan Angka pertama: ");
                a = sc.nextDouble();
                System.out.print("Masukkan Angka Kedua: ");
                b = sc.nextDouble();
                hasil = a % b;
                System.out.println("Hasil Modulus/sisa bagi = "+hasil);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
    }
}
