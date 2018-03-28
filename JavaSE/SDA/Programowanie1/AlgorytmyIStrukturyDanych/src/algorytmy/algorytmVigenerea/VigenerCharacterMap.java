package algorytmy.algorytmVigenerea;

import java.util.HashMap;
import java.util.Map;

public class VigenerCharacterMap {

    private Map<Integer, Character> int2char = new HashMap<>();
    private  Map<Character, Integer> char2int = new HashMap<>();
    private String password;

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public VigenerCharacterMap() {
        initMap();
    }

    private void initMap(){
        for(int i = 'a'; i < 'z'; i++) {
            this.int2char.put(i-97,(char)i);
            this.char2int.put((char)i,i-97);
        }
    }

    private char getCharByInt(int key){
        if(key < 0 ) key += 26;
        return int2char.get(key%26);
    }

    private int getIntByChar(char key){
        return char2int.get(key);
    }

    public String crypt(String wyraz, String password){
        setPassword(password);
        String szyfr ="";

        for(int i = 0; i < wyraz.length();i++){
            if(getPassword().length() < wyraz.length()) setPassword(getPassword()+getPassword());
            szyfr += getCharByInt(getIntByChar(wyraz.charAt(i)) + getIntByChar(getPassword().charAt(i)));
        }

        System.out.println("Wiadomość po zaszyfrowaniu " +szyfr);
        return szyfr;
    }

    public void decrypt(String szyfr){
        String wyrazPoOdszyfrowaniu ="";

        for(int i = 0; i < szyfr.length();i++){
            wyrazPoOdszyfrowaniu += getCharByInt(getIntByChar(szyfr.charAt(i)) - getIntByChar(getPassword().charAt(i)));
        }
        System.out.println("Wiadomosc odszyfrowana " + wyrazPoOdszyfrowaniu);
    }
}
