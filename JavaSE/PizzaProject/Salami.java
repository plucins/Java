package pizzaproject;

public class Salami extends PizzaDecorator {
    
    public Salami(Pizza p) {
        super(p);
    }
    
    public String getDiscription(){
        return pizza.getDiscription() + ", salami";
    }
    
    public double getCost(){
        return pizza.getCost() + 4.5;
    }
    
}
