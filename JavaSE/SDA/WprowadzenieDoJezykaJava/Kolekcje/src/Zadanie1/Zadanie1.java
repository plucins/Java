package Zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integers = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            integers.add(scanner.nextInt());
        }

        for(int i = 0; i < 5; i++){
            integers.add(new Random().nextInt(10));
        }

        for(Integer i: integers) {
            System.out.println(i);
        }
    }
}
