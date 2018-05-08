package zadanie0;

public class Hero {
    private int hp;
    private int power;
    private int atact;
    private int defence;
    private int mana;
    private int stamina;
    private int weight;
    private String name;
    private String lastName;

    private Hero(int hp, int power, int atact, int defence, int mana, int stamina, int weight, String name, String lastName) {
        this.hp = hp;
        this.power = power;
        this.atact = atact;
        this.defence = defence;
        this.mana = mana;
        this.stamina = stamina;
        this.weight = weight;
        this.name = name;
        this.lastName = lastName;
    }

    private Hero(Builder builder) {
        this.hp = builder.hp;
        this.power = builder.power;
        this.atact = builder.atact;
        this.defence = builder.defence;
        this.mana = builder.mana;
        this.stamina = builder.stamina;
        this.weight = builder.weight;
        this.name = builder.name;
        this.lastName = builder.lastName;
    }

    public static class Builder{
        private int hp;
        private int power;
        private int atact;
        private int defence;
        private int mana;
        private int stamina;
        private int weight;
        private String name;
        private String lastName;

        public Builder() {
        }

        public Builder setHp(int hp) {
            this.hp = hp;
            return this;
        }

        public Builder setPower(int power) {
            this.power = power;
            return this;
        }

        public Builder setAtact(int atact) {
            this.atact = atact;
            return this;
        }

        public Hero build(){
            return new Hero(this);
        }
    }
}
