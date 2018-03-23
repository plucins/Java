package Zadanie4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        int suma = 0;
        for(int i = 0; i < 100; i++){
            strings.add(Integer.toString(new Random().nextInt(100)));
            suma += Integer.parseInt(strings.get(i));
        }
        double srednia = suma/strings.size();
        System.out.println("Srednia to " + srednia);

        for(int i = 0; i < strings.size(); i++){
            if(Double.parseDouble(strings.get(i)) <  srednia){
                strings.remove(i);
            }
        }

        System.out.println(strings);

        strings.toArray();
    }
}
