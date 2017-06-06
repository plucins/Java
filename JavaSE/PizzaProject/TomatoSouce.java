package pizzaproject;

public class TomatoSouce extends PizzaDecorator {
    
    public TomatoSouce(Pizza p) {
        super(p);
    }
    
    public String getDiscription(){
        return pizza.getDiscription() + ", sos pomidorowy";
    }
    
    public double getCost(){
        return pizza.getCost() + 3.5;
    }
    
}
