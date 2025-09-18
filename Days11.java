package day11coding;
import java.util.Scanner;
public class Day11Coding {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = Sc.nextLine();
        
        System.out.print("Masukkan NIM : ");
        String nim = Sc.nextLine();
        
        System.out.print("Masukkan Umur : ");
        int Umur = Sc.nextInt();
        
        System.out.print("Masukkan tinggi : ");
        double a = Sc.nextDouble();
        
        System.out.print("Masukkan Jarak : ");
        byte x = Sc.nextByte();
        
        System.out.print("Masukkan Angka : ");
        short b = Sc.nextShort();
        
        System.out.print("Masukkan Angka1 : ");
        long c = Sc.nextLong();
        
        System.out.print("Masukkan Berat Badan : ");
        float d = Sc.nextFloat();
        
        System.out.print("Masukkan boolean : ");
        boolean f = Sc.nextBoolean();
        
        System.out.print("nilai : ");
        char g = Sc.next().charAt(0);
        
        System.out.println(g);

          System.out.print("Masukkan Nama  \t: ");
          String Nama = Sc.nextLine();
          System.out.print("Masukkan Mata Kuliah  \t: ");
          String mata = Sc.nextLine();
          System.out.print("Masukkan Nilai Ujian \t: ");
          int nli = Sc.nextInt();
          System.out.println("Nilai "+mata +" Kamu Adalah "+ nli);            
    } 
}
