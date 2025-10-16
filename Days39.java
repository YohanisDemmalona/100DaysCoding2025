package day30coding;
import java.util.Scanner;
public class day39Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = null;
        int pilihan, harga = 0, porsi;
        System.out.println("=== Menu Makanan ===");
        System.out.println("1. Bakso\n2. Mie Ayam\n3. Rujak");
        System.out.println();
        System.out.print("pilihan: ");
        pilihan = sc.nextInt();
        if(pilihan == 1){
            menu ="Bakso";
            harga = 10000;
        }else if(pilihan == 2){
            menu ="Mie Ayam";
            harga = 12000;
        }else if(pilihan ==3){
            menu ="Rujak";
            harga = 7000;
        }else{
            menu ="Menu tidak Ada";
        }
        System.out.print("Jumlah Porsi: ");
        porsi = sc.nextInt();
        System.out.println("=================");
        System.out.println("Menu Dipesan : ");
        System.out.println(menu+" - Rp."+harga+"/Porsi");
        harga = harga * porsi;
        System.out.println("Total Bayar : Rp."+harga);
    }
}
