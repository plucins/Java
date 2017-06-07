package pizzaproject;

public class CreamSouce extends PizzaDecorator {
    
    public CreamSouce(Pizza p) {
        super(p);
    }
    
    public String getDiscription(){
        return pizza.getDiscription() + ", sos śmietanowy";
    }
    
    public double getCost(){
        return pizza.getCost() + 3.5;
    }
    
}
