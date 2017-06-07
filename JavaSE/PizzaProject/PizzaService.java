package pizzaproject;

import java.util.Scanner;

public class PizzaService {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PizzaCreator pc = new PizzaCreator();
        
        System.out.println("Witaj w naszej Pizzerii");
        
        
        pc.createOwnPizza();
        
    }
}
