package Zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for(int i = 0; i < 10; i++ ){
            integers.add(new Random().nextInt(19)+1);
        }

        int suma = 0;
        for(Integer i: integers){
            suma += i;
        }
        System.out.println("Suma to " + suma);
        System.out.println("Srednia to " + suma/integers.size());
        System.out.println("Mediana to " + integers.get(integers.size()/2));
        int najwiekszy = integers.get(0);
        int najmniejszy = integers.get(0);
        for(Integer i: integers){
            if(i < najmniejszy) najmniejszy = i;
            if(i > najwiekszy) najwiekszy = i;
        }

        System.out.println("Najwięszka to " + najwiekszy + " Indeks -> "+integers.indexOf(najwiekszy));
        System.out.println("Najmniejsza to " + najmniejszy + " Indeks -> "+integers.indexOf(najmniejszy));





    }

}
