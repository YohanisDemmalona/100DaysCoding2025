package day70coding;
import java.util.Scanner;
public class day82Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka[] = new int[4];
	for(int data = 0; data < angka.length; data++ ){
	    System.out.print("masukkan nilai: ");
	    angka[data] = sc.nextInt();
	}
	System.out.println("Nilai Array: ");
	for(int i = 0; i < angka.length; i++){
	    System.out.print(angka[i]+" ");
        }
    }
}
