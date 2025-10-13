package day30coding;
import java.util.Scanner;
public class day36Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Hari: ");
        int hari = sc.nextInt();
        
        if(hari<=5){
           if(hari==5){
                   System.out.print("Lima dan");
           }
                if(hari%2==0){
               System.out.println("kecil dari lima dan genap");
               if(hari==2){
                   System.out.println("dua,kecil dari lima dan genap");
               }else{
                   System.out.println("bukan dua,kecil dari lima dan genap");
               }
           }else if  (hari%2==1){
               System.out.println(" ganjil");
           }
           
        }else if(hari>5)
            if(hari%2==0){
               System.out.println("Besar dari lima dan genap");
           }else if  (hari%2==1){
               System.out.println("Besar dari lima dan ganjil");
           }
    }
}
