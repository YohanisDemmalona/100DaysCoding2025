package day27coding;
import java.util.Scanner;
public class Day27Coding {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
          System.out.print("Jumlah pulsa: ");
          int jumlah = sc.nextInt();
          int hargaTetap = 10000;
          int jmh = jumlah * hargaTetap;
          System.out.println("Sebelum: "+jmh);
          int admin = 2000;
          int hasil = jmh+admin;
          System.out.println("Sesudah: "+hasil);
    } 
}
