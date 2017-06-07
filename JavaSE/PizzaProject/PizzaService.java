package pizzaproject;

import java.util.Scanner;

public class PizzaService {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PizzaCreator pc = new PizzaCreator();
        PizzaMenu pm = new PizzaMenu();
        
        Pizza pizza = null;
        String adres = null;
        int wybor;
        
        System.out.println("Witaj w naszej Pizzerii");
        System.out.println("1. Zobacz nasze propozycje");
        System.out.println("2. Stwórz własną Pizze");
        
        wybor = sc.nextInt();
        sc.nextLine();
        switch(wybor){
            case 1:
                pizza = pm.PizzaMenu();
                break;
            case 2:
                pizza = pc.createOwnPizza();
                break;
            default: 
                System.out.println("Błędny wybór");
        }
        
        System.out.println("Czy życzysz sobie dostawę do domu? (Koszt + 5zł)[1 - tak/0 - nie]");
        wybor = sc.nextInt();
        sc.nextLine();
        if(wybor == 1){
            System.out.println("Podaj adres dostawy");
            adres = sc.nextLine();
            pizza = new Delivery(pizza);
        }
        System.out.println();
        System.out.println("~~~~Podsumowanie~~~~");
        System.out.println("Wybrałeś pizze: " + pizza.getDiscription());
        System.out.println("Do zapłaty " + pizza.getCost() + " Zł");
        if(wybor == 1) System.out.println("Dostawa na adres " + adres);
        else System.out.println("Twoje zamówienie będzie do odbioru za 45min");
    }
}
