package pizzaproject;

public class PizzaMedium implements Pizza {
    
    @Override
    public String getDiscription(){
        return "Średnia";
    }
    
    
    @Override
    public double getCost(){
        return 15.00;
    }
}
