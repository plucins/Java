package struktury.stackWithCars;

public class Main {
    public static void main(String[] args) {
        StackController s = new StackController();

        s.addCarToFerry(new Car("Audi", 44.21,"GD24121"));
        s.addCarToFerry(new Car("Mazda", 37.55,"GD87654"));
        s.addCarToFerry(new Car("Fiat", 75.92,"GD54321"));

        s.printCarsInFerry();
        System.out.println(s.getPriceCarsOnFerry());
        s.unloadFerry();
        s.printCarsInFerry();
        System.out.println(s.getCarsCount());
    }
}
