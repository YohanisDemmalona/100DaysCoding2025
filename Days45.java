package day40coding;
import java.util.Scanner;
public class day45Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("Hari ke: ");
          int angka = sc.nextInt();
          
          switch(angka){
              case 1:
                  System.out.println("senin");
                  break;
              case 2:
                  System.out.println("selasa");
                  break;
              case 3:
                  System.out.println("Rabu");
                  break;
              case 4:
                  System.out.println("kamis");
                  break;
              default :
                  System.out.println("Tidak kenal");
                  break;
          }
    }
}
