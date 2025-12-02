package day70coding;
import java.util.Scanner;
public class day86Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Angka minimal array: " + min);
    }
}
