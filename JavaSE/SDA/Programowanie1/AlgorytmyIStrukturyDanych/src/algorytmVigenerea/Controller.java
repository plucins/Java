package algorytmVigenerea;

import java.util.HashMap;
import java.util.Map;

public class Controller {

    private Map<Integer, Character> int2char = new HashMap<>();
    private  Map<Character, Integer> char2int = new HashMap<>();

    public Controller() {
        initMap();
    }

    private void initMap(){
        for(int i = 'a'; i < 'z'; i++) {
            this.int2char.put(i-97,(char)i);
            this.char2int.put((char)i,i-97);
        }
    }

    public char getCharByInt(int key){
        if(key < 0 ) key += 26;
        return int2char.get(key%26);
    }

    public int getIntByChar(char key){
        return char2int.get(key);
    }
}
