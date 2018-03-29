package struktury.stackWithCars;

import java.util.LinkedList;

public class StackController {

    public StackController() {
    }

    LinkedList<Car> ferry = new LinkedList<>();

    public void addCarToFerry(Car c){
        ferry.push(c);
    }

    public void printCarsInFerry(){
        ferry.stream().forEach(System.out::println);
    }

    public void unloadFerry(){
        int counter = ferry.size();
        for(int i = 0; i < counter; i++){
            System.out.println("Unloading " +ferry.pop());
        }
    }

    public int getCarsCount(){
        return ferry.size();
    }

    public double getPriceCarsOnFerry(){
        return ferry.stream().mapToDouble(Car::getPrice).sum();
    }
}
