package Zadanie3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add(Arrays.asList(10030, 3004, 4000, 12355, 12222, 67888, 111200, 225355, 2222, 1111, 3546, 138751, 235912).toString());


        System.out.println("Indeks elementu 138751" + strings.indexOf("138751"));
        System.out.println(strings.contains("67888"));
        System.out.println(strings.contains("67889"));
        strings.remove("67888");
        strings.remove("67889");
        System.out.println(strings.contains("67888"));
        System.out.println(strings.contains("67889"));
        System.out.println("Indeks elementu 138751" + strings.indexOf("138751"));

        System.out.println(strings);
        for(String s: strings){
            System.out.println(s);
        }
    }



}
