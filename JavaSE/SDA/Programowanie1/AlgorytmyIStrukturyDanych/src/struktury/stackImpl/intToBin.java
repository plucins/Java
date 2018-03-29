package struktury.stackImpl;

import java.util.LinkedList;

public class intToBin {
    public static void main(String[] args) {
        LinkedList<Integer> stos = new LinkedList();
        int liczba = 77;

        while(liczba != 0){
            stos.push(liczba % 2);
            liczba = liczba / 2;
        }

        int counter = stos.size();
        for(int i = 0; i < counter; i++){
            System.out.print(stos.pop());
        }
    }
}
