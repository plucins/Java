package struktury.listWithString;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Stwórz listę zawierającą wyrazy.
//Przeiteruj po całej liście sprawdzając, czy znajduje się tam litera "l".
//Jeżeli w danym wyrazie litera ta występuje - usuń ten wyraz.
//Na koniec sprawdź ile wyrazów pozostało.

public class ListController {
    List<String> generatedRandomStringList = new ArrayList<>();

    ListController() {
        generateRandomStringList();
    }

    private void generateRandomStringList(){
        for(int i = 0; i < 10; i++){

            String word = "";
            int wordLenght = new Random().nextInt(10)+3;
            for(int j = 0; j < wordLenght; j++){
                word += (char)('a' + new Random().nextInt(26));
            }
            generatedRandomStringList.add(word);
        }
    }

    private int isLetterExistInList(String s, char l){
           return s.indexOf(""+l);
    }

    public void deleteStringFromListWith(char l){
        for(int i = 0; i < generatedRandomStringList.size(); i++){
            if (isLetterExistInList(generatedRandomStringList.get(i),l) < 0){
                generatedRandomStringList.remove(generatedRandomStringList.get(i));
            }
        }
    }

    public void printList(){
        generatedRandomStringList.stream().forEach(System.out::println);
    }



}
