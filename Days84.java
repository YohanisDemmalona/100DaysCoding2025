package day70coding;
import java.util.Scanner;
public class day84Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + N + " = " + (i*N)); 
        }
    }
}
