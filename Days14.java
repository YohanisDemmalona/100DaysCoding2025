package day14coding;
public class Day14Coding {
    public static void main(String[] args) {
        String strInt = "10";
        int nilaiInt = Integer.parseInt(strInt);
        System.out.println("Nilai String Int : "+(nilaiInt +10));
        
        String strDouble = "40.5";
        double nilaiDouble = Double.parseDouble(strDouble);
        System.out.println("Nilai String Double : "+nilaiDouble);
        
        String strFloat = "12.43";
        float nilaiFloat = Float.parseFloat(strFloat);
        System.out.println("Nilai String Float : "+nilaiFloat);
        
        String strBoolean = "false";
        boolean nilaiBoolean = Boolean.parseBoolean(strBoolean);
        System.out.println("Nilai String Float : "+nilaiBoolean);
        
        String teks ="Anis";
        char huruf = teks.charAt(0);
        System.out.println("hasil : "+huruf);
        
        String strLong = "100000000000";
        long nilaiLong = Long.parseLong(strLong);
        System.out.println("Nilai String Long : "+nilaiLong);
        
        String strByte = "20";
        byte nilaiByte = Byte.parseByte(strByte);
        System.out.println("Nilai String Byte : "+nilaiByte);
        
        String strShort = "30";
        short nilaiShort = Short.parseShort(strShort);
        System.out.println("Nilai String Short : "+nilaiShort);
    } 
}
