package Zadanie9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Litera litera = new Litera();

        System.out.println(litera.isListContains(litera.getAllLetters()));
        litera.printLetters(litera.getAllLetters());
        System.out.println(litera.isStringContainsOnlyPolishAlphabetCharts("asd@#$%^"));

        //System.out.println(litera.newSet(1,2,3,4,5,6,1));

        List<Integer> list1=Arrays.asList(1,2,1);
        List<Integer>list2=Arrays.asList(4,5,6);
        List<Integer>list3= Arrays.asList(7,8,9);
        List<Integer>list4=Arrays.asList(10,0,-1);

        System.out.println(litera.mergeLists(list1,list2,list3,list4));
    }
}
