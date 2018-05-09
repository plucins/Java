package zadanie0;

public class Hero {
    private String name;
    private IStrategy strategy;

    public Hero(String name) {
        this.name = name;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void fight(){
        strategy.fight();
    }

}
