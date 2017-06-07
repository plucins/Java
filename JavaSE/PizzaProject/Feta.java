package pizzaproject;

public class Feta extends PizzaDecorator {
    
    public Feta(Pizza p) {
        super(p);
    }
    
    public String getDiscription(){
        return pizza.getDiscription() + ", ser feta";
    }
    
    public double getCost(){
        return pizza.getCost() + 4.0;
    }
    
}
