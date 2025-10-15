package day30coding;
import java.util.Scanner;
public class day38Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = sc.nextInt();
        
        if(angka>0){
            System.out.println("Angka Positif");
        }else if(angka<0){
            System.out.println("Angka Negatif");
        }else{
            System.out.println("Nol");
        }
    } 
}
