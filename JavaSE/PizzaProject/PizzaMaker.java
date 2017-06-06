package pizzaproject;


public class PizzaMaker {
    public static void main(String[] args) {
        Pizza basicPizza = new Mushrooms(new PizzaLarge());
        
        System.out.println("Składniki: " + basicPizza.getDiscription());
        System.out.println("Cena: " +basicPizza.getCost());
        
        basicPizza = new TomatoSouce(new PizzaLarge());
        
        System.out.println("Składniki: " + basicPizza.getDiscription());
        System.out.println("Cena: " +basicPizza.getCost());
        
    }
}
