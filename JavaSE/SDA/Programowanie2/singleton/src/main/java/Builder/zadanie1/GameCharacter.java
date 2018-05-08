package Builder.zadanie1;

public class GameCharacter {
    private String name;
    private double health;
    private double mana;
    private int numberOfPoints;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public GameCharacter(Builder builder) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.numberOfPoints = numberOfPoints;
    }

    public static class Builder{
        private String name;
        private double health;
        private double mana;
        private int numberOfPoints;

        public Builder(String name, double health, double mana, int numberOfPoints) {
            this.name = name;
            this.health = health;
            this.mana = mana;
            this.numberOfPoints = numberOfPoints;
        }

        public GameCharacter build(){
            return new GameCharacter(this);
        }
    }
}
