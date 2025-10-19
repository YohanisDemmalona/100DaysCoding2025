package day40coding;
import java.util.Scanner;
public class day42Coding {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = sc.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = sc.nextDouble();

        System.out.print("Masukkan pajak (%): ");
        double pajak = sc.nextDouble();

        double gajiTotal = gajiPokok + tunjangan;
        double potonganPajak = (pajak / 100) * gajiTotal;
        double gajiBersih = gajiTotal - potonganPajak;

        System.out.println("Gaji Pokok: Rp." + gajiPokok);
        System.out.println("Tunjangan: Rp." + tunjangan);
        System.out.println("Gaji Bruto: Rp." + gajiTotal);
        System.out.println("Potongan Pajak: Rp." + potonganPajak);
        System.out.println("Gaji Bersih: Rp." + gajiBersih);
  
    }
}
