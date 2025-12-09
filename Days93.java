package day70coding;
import java.util.Scanner;
public class day93Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan: ");
        double Bil =sc.nextDouble();
        
        System.out.println("Ceil: " + Math.ceil(Bil));
        System.out.println("Floor: " + Math.floor(Bil));
        System.out.println("Round: " + Math.round(Bil));
        
    }
}
