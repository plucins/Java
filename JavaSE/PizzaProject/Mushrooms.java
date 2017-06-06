package pizzaproject;

public class Mushrooms extends PizzaDecorator {
    
    public Mushrooms(Pizza p) {
        super(p);
    }
    
    public String getDiscription(){
        return pizza.getDiscription() + ", pieczarki";
        
    }
    
    public double getCost(){
        return pizza.getCost() + 2.5;
    }
    
    
}
