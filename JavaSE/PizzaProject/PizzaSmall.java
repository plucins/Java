package pizzaproject;

public class PizzaSmall implements Pizza {
    
    @Override
    public String getDiscription(){
        return "Mała";
    }
    
    
    @Override
    public double getCost(){
        return 10.00;
    }
}
