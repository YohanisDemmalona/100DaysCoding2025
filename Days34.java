package day30coding;
public class day34Coding {
    public static void main(String[] args) {
      int x = 10;
      int y = 5;    
      boolean hasilAnd = (x>y) && (x<y);
      boolean hasilOr = (x>y) || (x==y);
      boolean hasilNot = !(x>y);
        System.out.println("Hasil And: "+hasilAnd);
        System.out.println("Hasil Or: "+hasilOr);
        System.out.println("Hasil Not: "+hasilNot);
    }

}
