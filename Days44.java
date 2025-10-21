package day40coding;
import java.util.Scanner;
public class day44Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = sc.nextInt();
        
        if(nilai>=90){
            System.out.print("Predikat A");
            if(nilai == 100){
                System.out.println(" Sempurna");
            }
        }else if (nilai >=80){
            System.out.println("Predikat B");
        }else if(nilai >=70){
            System.out.println("Predikat C");
        }else{
            System.out.println("Predikat E");
        }
    }
}
