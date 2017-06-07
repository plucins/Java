package pizzaproject;

import java.util.Scanner;

public class PizzaCreator {

    Scanner sc = new Scanner(System.in);
    int wybor = -1;

    public Pizza createOwnPizza() {
        
        Pizza pizza = new PizzaSmall();
        int size = 0;
        boolean czyDobrze = false;
        do {
            System.out.println("Wybierz interesujący Cie rozmiar Pizzy");
            System.out.println("1 - Mała, 2 - Średnia, 3 - Duża");

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

        } while(czyDobrze);

        System.out.println("wybierz interesujące Cie składniki");
        System.out.println();
        System.out.println("SOS: 1 - pomidorowy, 2- śmietanowy");
        System.out.println("Składniki mięsne: 3 - szynka, 4 - salami");
        System.out.println("Składniki serowe: 5 -  mozarella, 6 - ser feta");
        System.out.println("Dodatki: 7 -  pieczarki, 8 - cebula");
        System.out.println("0 - koniec zamówienia");
        
        do {
            wybor = sc.nextInt();
            sc.nextLine();
            switch (wybor) {
                case 1:
                    pizza = new TomatoSouce(pizza);
                    break;
                case 2:
                    pizza = new CreamSouce(pizza);
                    break;
                case 3:
                    pizza = new Ham(pizza);
                    break;
                case 4:
                    pizza = new Salami(pizza);
                    break;
                case 5:
                    pizza = new Mozarella(pizza);
                    break;
                case 6:
                    pizza = new Feta(pizza);
                    break;
                case 7:
                    pizza = new Mushrooms(pizza);
                    break;
                case 8:
                    pizza = new Onion(pizza);
                    break;
            }
            if(wybor != 0){
                System.out.println(pizza.getDiscription());
                System.out.println(pizza.getCost());
            }
        }while (wybor != 0);
        
        return pizza;
    }

}
