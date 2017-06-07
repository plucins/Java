package pizzaproject;

public class Delivery extends PizzaDecorator {
    
    public Delivery(Pizza p) {
        super(p);
    }
    
    public String getDiscription(){
        return pizza.getDiscription() + " + koszt dostawy";
    }
    
    public double getCost(){
        return pizza.getCost() + 5.0;
    }
    
}
