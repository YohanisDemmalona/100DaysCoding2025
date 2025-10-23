package day40coding;
import java.util.Scanner;
public class day46Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan, jumlah, total = 0;

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng     - Rp 15.000");
        System.out.println("2. Mie Goreng      - Rp 12.000");
        System.out.println("3. Ayam Geprek     - Rp 18.000");
        System.out.println("4. Soto Ayam       - Rp 14.000");
        System.out.print("Masukkan pilihan (1-4): ");
        pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Jumlah Nasi Goreng: ");
                jumlah = sc.nextInt();
                total = jumlah * 15000;
                System.out.println("Total harga: Rp " + total);
                break;

            case 2:
                System.out.print("Jumlah Mie Goreng: ");
                jumlah = sc.nextInt();
                total = jumlah * 12000;
                System.out.println("Total harga: Rp " + total);
                break;

            case 3:
                System.out.print("Jumlah Ayam Geprek: ");
                jumlah = sc.nextInt();
                total = jumlah * 18000;
                System.out.println("Total harga: Rp " + total);
                break;

            case 4:
                System.out.print("Jumlah Soto Ayam: ");
                jumlah = sc.nextInt();
                total = jumlah * 14000;
                System.out.println("Total harga: Rp " + total);
                break;
                
            default:
                System.out.println("Pilihan tidak tersedia!");
                break;
        }

    } 
}
