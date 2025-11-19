package day70coding;
import java.util.Scanner;
public class day73Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0;
        while(true){
            System.out.print("Masukkan angka (negatif untuk berhenti): ");
            int angka = sc.nextInt();
            if(angka >=0){
                jumlah += angka;
            }else{
                System.out.println("jumlah angka: "+ jumlah);
                break;
            }
        }
    }
}
