package pizzaproject;

public class Onion extends PizzaDecorator {
    
    public Onion(Pizza p) {
        super(p);
    }
    
    public String getDiscription(){
        return pizza.getDiscription() + ", cebula";
    }
    
    public double getCost(){
        return pizza.getCost() + 3.0;
    }
    
}
