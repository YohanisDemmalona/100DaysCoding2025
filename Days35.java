package day30coding;
import java.util.Scanner;
public class day35Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        int nilai = sc.nextInt();
        int kehadiran = sc.nextInt();
        if(nilai >=60 && kehadiran >=80){
            System.out.println("siswa dapat mengikuti ujian akhir semester");
        }else{
            System.out.println("siswa tidak dapat mengikuti ujian akhir semester");
        }
    }
}
