package day70coding;
public class day95Coding {
    public static void main(String[] args) {
       cetakPesan("Hallo, Apa Kabar?", 3); 
    }
    static void cetakPesan(String pesan, int jumlah){
        for (int i = 0; i < jumlah; i++) {
            System.out.println(pesan);
        }
    }
}
