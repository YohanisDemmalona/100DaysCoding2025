package day40coding;
import java.util.Scanner;
public class day49Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai =sc.nextInt();
           
           String nl = (nilai >=90) ? "A" : (nilai >=80) ? "B" : (nilai >=70) ? "C" : "D";
           System.out.println("Predikat "+nl);
    }
}
