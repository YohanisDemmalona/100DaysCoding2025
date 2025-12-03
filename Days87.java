package day70coding;
import java.util.Scanner;
public class day87Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen Array: ");
        int N = sc.nextInt();
        int [] Array = new int [N];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.print("Masukkan Elemen Yang ingin di cari: ");
        int cari = sc.nextInt();
        
        boolean ditemukan = false;
        for (int i = 0; i < N; i++) {
           if(Array[i] == cari){
               System.out.println("Elemen " + cari + " ditemukan pada index "+i);
               ditemukan = true;
           }
        }
        if(!ditemukan){
            System.out.println("Elemen "+ cari + " tidak di temukan");
        }
    }
}
