package struktury.arrayListVsLinkedList;

import java.util.*;

public class ArraysGenerator {

    private List<Integer> arrayList = new ArrayList<>();
    private List<Integer> linkedList = new LinkedList<>();

    public ArraysGenerator() {
    }


    private void initArray(){
        for(int i = 0; i < 100000; i++){
            arrayList.add(new Random().nextInt(2000));
        }
    }

    private void initLinked(){
        for(int i = 0; i < 100000; i++){
            linkedList.add(new Random().nextInt(2000));
        }
    }

    public double addInTheMiddleArray(){
        arrayList = new ArrayList<>(1);
        double czas = new Date().getTime();
        for(int i = 0; i < 100000; i++) {
            arrayList.add(arrayList.size() / 2, new Random().nextInt(2000) );
        }

        return new Date().getTime() - czas;
    }

    public double addInTheMiddleLinked(){
        linkedList.clear();
        double czas = new Date().getTime();
        for(int i = 0; i < 100000; i++) {
            linkedList.add(i/2, new Random().nextInt(2000) );
        }

        return new Date().getTime() - czas;
    }

    public double addAtStartleLinked(){
        linkedList.clear();
        double czas = new Date().getTime();
        for(int i = 0; i < 100000; i++) {
            linkedList.add(0, new Random().nextInt(2000));
        }

        return new Date().getTime() - czas;
    }

    public double addAtStartArray(){
        arrayList.clear();
        double czas = new Date().getTime();
        for(int i = 0; i < 100000; i++) {
            arrayList.add(0, new Random().nextInt(2000));
        }

        return new Date().getTime() - czas;
    }

    public double addAtEndLinked(){
        linkedList.clear();
        double czas = new Date().getTime();
        for(int i = 0; i < 100000; i++) {
            linkedList.add(new Random().nextInt(2000) );
        }

        return new Date().getTime() - czas;
    }

    public double addAtEndArray(){
        arrayList.clear();
        double czas = new Date().getTime();
        for(int i = 0; i < 100000; i++) {
            arrayList.add(new Random().nextInt(2000) );
        }

        return new Date().getTime() - czas;
    }

    public double removeArray(){
        double czas = new Date().getTime();
        for(int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(i);
        }
        return new Date().getTime() - czas;
    }

    public double removeLinked(){
        double czas = new Date().getTime();
        for(int i = 0; i < arrayList.size(); i++) {
            linkedList.remove(i);
        }
        return new Date().getTime() - czas;
    }

    public double getLinked(){
        initLinked();
        double czas = new Date().getTime();
        for(int i = 0; i < linkedList.size(); i++){
            linkedList.get(i);
        }
        return new Date().getTime() - czas;
    }

    public double getArray(){
        initArray();
        double czas = new Date().getTime();
        for(int i = 0; i < arrayList.size(); i++){
            arrayList.get(i);
        }
        return new Date().getTime() - czas;
    }


}
