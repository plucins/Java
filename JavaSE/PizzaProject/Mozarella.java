package pizzaproject;

public class Mozarella extends PizzaDecorator {
    
    public Mozarella(Pizza p) {
        super(p);
    }
    
    public String getDiscription(){
        return pizza.getDiscription() + ", ser mozzarella";
    }
    
    public double getCost(){
        return pizza.getCost() + 4.0;
    }
    
}
