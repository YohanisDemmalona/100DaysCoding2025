package day40coding;
import java.util.Scanner;
public class day43Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        if(angka % 3 == 0 && angka % 5 == 0){
            System.out.println(angka+" adalah kelipatan dari 3 dan 5");
        }else if(angka % 3 ==0){
            System.out.println(angka+" adalah kelipatan dari 3");
        }else if(angka % 5 == 0){
            System.out.println(angka+" adalah kelipatan dari 5");
        }else{
            System.out.println(angka+" bukan kelipatan dari 3 dan 5");
        }
   }
}
