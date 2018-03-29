package struktury.queueImpl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueController {
    private Queue<Petent> queue = new LinkedList<>();

    public boolean isQueueEmpty(){
        return queue.isEmpty();
    }

    public void printAllPersonsInQueue(){
        queue.stream().forEach(System.out::println);
    }

    private String generateRandomString(){
        String wyraz = "";
        for(int i = 0; i < new Random().nextInt(7)+5; i++){
            wyraz += pickRandomChar();
        }
        return wyraz;
    }

    private char pickRandomChar(){
        return (char) (97 + new Random().nextInt(26));
    }

    private String generateRandomWalidPesel(){
        String pesel = "";
        pesel += "19";
        pesel += ""+ (new Random().nextInt(89) + 10);
        pesel += "0"+ (new Random().nextInt(8)+1);
        pesel += ""+ (new Random().nextInt(100) + 899);
        pesel += new Random().nextInt(9);
        int controlSum = char2Int(pesel.charAt(0))*9 + char2Int(pesel.charAt(1))*7 + char2Int(pesel.charAt(2))*3 +
                char2Int(pesel.charAt(3)) + char2Int(pesel.charAt(4))*9 + char2Int(pesel.charAt(5))*7 + char2Int(pesel.charAt(6))*3 +
                        char2Int(pesel.charAt(7)) + char2Int(pesel.charAt(8))*9 + char2Int(pesel.charAt(9))*7;
        pesel += "" + controlSum%10;


        return pesel;
    }

    private int char2Int(char s){
        return Integer.parseInt(String.valueOf(s));
    }

    private Petent generatePetent(){
        return new Petent(generateRandomString(),generateRandomString(),generateRandomWalidPesel());
    }

    private void addToQueue(Petent petent){
        queue.offer(petent);
    }

    public void addToQueue(int count){
        for(int i = 0; i < count; i++){
            addToQueue(generatePetent());
        }
    }

    private void removeFromQueue(){
        queue.poll();
    }

    public void removeFromQueue(int count){
        for(int i = 0; i < count; i++){
            removeFromQueue();
        }
    }


    public boolean isPersonAbove50(Petent p){
        return 118 - (Integer.parseInt(p.getPesel().substring(2,4))) > 50;
    }

}
