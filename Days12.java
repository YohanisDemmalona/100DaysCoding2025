package day12coding.java;
import java.util.Scanner;
public class Day12Coding {

    public static void main(String[] args) {
        Scanner Biodata = new Scanner(System.in);
        
        System.out.print("Nama Lengkap :");
        String Nama = Biodata.nextLine();
        
        System.out.print("Tempat dan tanggal lahir :");
        String tmptTglLhr = Biodata.nextLine();
        
        System.out.print("Jenis kelamin :");
        String jenisKelamin = Biodata.nextLine();
       
        System.out.print("Agama :");
        String agama = Biodata.nextLine();
        
        System.out.print("status :");
        String status = Biodata.nextLine();
        
        System.out.print("Tinggi Badan :");
        int tinggibadan = Biodata.nextInt();
     
        System.out.print("Berat Badan :");
        double BB = Biodata.nextDouble();
        
        System.out.print("Nomor Telepon :");
        long Telepon = Biodata.nextLong();
        
        System.out.println("Nama Lengkap Anda Adalah "+Nama);
        System.out.println("Tempat dan Tanggal Lahir Anda Adalah "+tmptTglLhr);
        System.out.println("Jenis Kelamin Anda Adalah "+jenisKelamin);
        System.out.println("Agama Anda Adalah "+agama);
        System.out.println("status Anda Adalah "+status);
        System.out.println("Tinggi Badan Anda adalah "+tinggibadan + "Cm");
        System.out.println("Berat Badan Anda Adalah "+BB + "Kg");
        System.out.println("Nomor Telepon Anda Adalah "+Telepon);
    }   
}
