package Calculable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj co chcesz zrobic");
        Scanner scanner = new Scanner(System.in);
        String zmienna = scanner.nextLine();
        double wynik = 0;

        switch (zmienna){
            case "add":
                wynik = new SumEquation(scanner.nextInt(),scanner.nextInt()).calculate();
                break;
            case "sub":
                wynik = new SubtractEquation(scanner.nextInt(),scanner.nextInt()).calculate();
                break;
            case "div":
                wynik = new DivEquation(scanner.nextInt(),scanner.nextInt()).calculate();
                break;
            case "mul":
                wynik = new MulEquation(scanner.nextInt(),scanner.nextInt()).calculate();
                break;
            case "pow":
                wynik = new PowEquation(scanner.nextInt(),scanner.nextInt()).calculate();
                break;
        }
        System.out.println(wynik);
    }
}
