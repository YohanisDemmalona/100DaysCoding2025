package day30coding;
import java.util.Scanner;
public class day37Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Angka: ");
        int angka = sc.nextInt();
        
        if(angka%2==0){
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Bilangan ganjil");
        }
    }
}
