package pizzaproject;

public class PizzaLarge implements Pizza {
    
    @Override
    public String getDiscription(){
        return "Duża";
    }
    
    
    @Override
    public double getCost(){
        return 20.00;
    }
}
