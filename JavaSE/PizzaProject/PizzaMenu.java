package pizzaproject;

import java.util.Scanner;

public class PizzaMenu {

    Scanner sc = new Scanner(System.in);
    int wybor = -1;

    public Pizza PizzaMenu() {
        
        Pizza pizza = null;
        int size = 0;
        boolean czyDobrze;
        do {
            System.out.println("Wybierz interesujący Cie rozmiar Pizzy");
            System.out.println("1 - Mała, 2 - Średnia, 3 - Duża");
            czyDobrze = true;
            size = sc.nextInt();
            switch (size) {
                case 1:
                    pizza = new PizzaSmall();
                    break;
                case 2:
                    pizza = new PizzaMedium();
                    break;
                case 3:
                    pizza = new PizzaLarge();
                    break;
                default:
                    czyDobrze = false;
                    break;
            }

        } while(!czyDobrze);
        System.out.println();
        System.out.println("=====Menu=====");
        System.out.println("1. Wegetariańska (Sos pomidorowy, pieczarki, cebula)");
        System.out.println("2. Capricciosa (Sos śmietanowy, pieczarki, szynka)");
        System.out.println("3. Sallaniooos (Sos pomidorowy, cebula, salami x2)");
        
            wybor = sc.nextInt();
            sc.nextLine();
            switch (wybor) {
                case 1:
                    pizza = new TomatoSouce(new Mushrooms(new Onion(pizza)));
                    break;
                case 2:
                    pizza = new CreamSouce(new Mushrooms(new Ham(pizza)));
                    break;
                case 3:
                    pizza = new TomatoSouce(new Onion(new Salami(new Salami(pizza))));
                    break;
            }
                System.out.println(pizza.getDiscription());
                System.out.println(pizza.getCost());

        return pizza;
    }

}
