package latihansendiri;
import java.util.Scanner;
public class NewClass8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int nilai = sc.nextInt();
        
        if(nilai>=90){
            System.out.print("Predikat A");
            if(nilai == 100){
                System.out.println(" sempurna");
            }
        }else if (nilai >=80){
            System.out.println("Predikat B");
        }else if(nilai >=70){
            System.out.println("Predikat C");
        }else{
            System.out.println("Siswa tidak Lulus");
        }
    }
}
