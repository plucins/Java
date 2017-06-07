package pizzaproject;

public class Ham extends PizzaDecorator {
    
    public Ham(Pizza p) {
        super(p);
    }
    
    public String getDiscription(){
        return pizza.getDiscription() + ", szynka";
    }
    
    public double getCost(){
        return pizza.getCost() + 4.5;
    }
    
}
