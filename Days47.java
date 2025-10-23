package day40coding;
import java.util.Scanner;
public class day47Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan hari 1-8: ");
        int hari = sc.nextInt();
          
          switch(hari){
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
              case 5:
                  System.out.println("Jumat");
                  break;
              case 6:
                  System.out.println("Sabtu");
                  break;
              case 8:
                  System.out.println("Minggu");
                  break;
              default :
                  System.out.println("Tidak valid");
                  break;
          }
    }
}
