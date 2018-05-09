package zadanie0;

import zadanie0.strategie.WithSheep;

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("Adam");

        h.setStrategy(new WithSheep());
        h.fight();
    }
}
