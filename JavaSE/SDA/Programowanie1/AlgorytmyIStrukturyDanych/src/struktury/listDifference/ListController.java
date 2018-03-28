package struktury.listDifference;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListController {
    private List<Character> alphabet = new ArrayList<>();
    private List<Character> generatedChars = new ArrayList<>();

    ListController() {
        initAlphabet();
        initGeneratedChars();
    }

    private void initAlphabet(){
        for(char i = 'a'; i < 'z'; i++){
            alphabet.add(i);
        }
    }

    private void initGeneratedChars(){
        for(int i = 0; i < 10; i ++){
            generatedChars.add((char)('a' + new Random().nextInt(26)));
        }
    }

    public List<Character> getDifference(){
        List<Character> differentCharacters = new ArrayList<>();
        for (Character a : alphabet) {
            if (!generatedChars.contains(a)) differentCharacters.add(a);
        }
        return differentCharacters;
    }



}
