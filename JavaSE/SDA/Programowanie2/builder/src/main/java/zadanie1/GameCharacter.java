package zadanie1;

public class GameCharacter {
    private String name;
    private double health;
    private double mana;
    private int numberOfPoints;

    public GameCharacter(String name, double health, double mana, int numberOfPoints) {
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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHealth(double health) {
            this.health = health;
            return this;
        }

        public Builder setMana(double mana) {
            this.mana = mana;
            return this;
        }

        public Builder setNumberOfPoints(int numberOfPoints) {
            this.numberOfPoints = numberOfPoints;
            return this;
        }

        public GameCharacter build() {
            return new GameCharacter(name, health, mana, numberOfPoints);
        }
    }
}
