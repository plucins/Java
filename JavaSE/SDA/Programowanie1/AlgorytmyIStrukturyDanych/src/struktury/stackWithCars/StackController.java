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
        for(int i = 0; i < ferry.size(); i++){
            System.out.println(ferry.pop());
        }
    }

    public int returnCarsCount(){
        return ferry.size();
    }
}
