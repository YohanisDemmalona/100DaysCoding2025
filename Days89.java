package day70coding;
import java.util.Scanner;
public class day89Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        int bil = sc.nextInt();
        cekBilGanjilGenap(bil);
    }
    public static void cekBilGanjilGenap(int bil) {
       if(bil%2==0){
           System.out.println(bil+" Genap");
       }else{
           System.out.println(bil+" Ganjil");
       }
    }
}
