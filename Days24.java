package day24coding;
import java.util.Scanner;
public class Day24Coding {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = sc.nextDouble();
        double luas = 3.14 * jariJari * jariJari;
        System.out.println("Luas lingkaran adalah: " + luas);
    }
}
