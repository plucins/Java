package algorytmVigenerea;

public class Main {
    public static void main(String[] args) {
        String wyraz = "makeithappen";
        String haslo = "math";
        Controller c = new Controller();
        String szyfr = "";
        String wyrazPoOdszyfrowaniu = "";

        for(int i = 0; i < wyraz.length();i++){
            if(haslo.length() < wyraz.length()) haslo += haslo;
            szyfr += c.getCharByInt(c.getIntByChar(wyraz.charAt(i)) + c.getIntByChar(haslo.charAt(i)));
        }
        System.out.println(szyfr);

        for(int i = 0; i < szyfr.length();i++){
            wyrazPoOdszyfrowaniu += c.getCharByInt(c.getIntByChar(szyfr.charAt(i)) - c.getIntByChar(haslo.charAt(i)));
        }

        System.out.println(wyrazPoOdszyfrowaniu);
    }
}
