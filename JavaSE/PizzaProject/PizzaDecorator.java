package pizzaproject;


public class PizzaDecorator implements Pizza {
    
    protected Pizza pizza;
    
    public PizzaDecorator(Pizza p){
        pizza = p;
    }

    @Override
    public String getDiscription() {
       return pizza.getDiscription();
    }

    @Override
    public double getCost() {
        
        return pizza.getCost();
    }
    
}
