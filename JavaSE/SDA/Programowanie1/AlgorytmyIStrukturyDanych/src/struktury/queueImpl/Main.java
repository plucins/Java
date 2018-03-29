package struktury.queueImpl;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueController q = new QueueController();
        Scanner s = new Scanner(System.in);
        int ilosc = 0;

         do{
            System.out.println("Ile osób chcesz dodać");
            int countToAdd = s.nextInt();
            q.addToQueue(countToAdd);
            ilosc += countToAdd;

            int countToDelete = new Random().nextInt(2)+3;
            System.out.println("Usuwam " + countToDelete + " osoby");
            q.removeFromQueue(countToDelete);
            q.printAllPersonsInQueue();
            ilosc -= countToDelete;
        }while(ilosc > 0);

        System.out.println("Kolejka pusta");
    }
}
