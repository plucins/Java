package struktury.stackImpl;

import java.util.LinkedList;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();

        String w = "wyraz";

        for(int i = 0; i < w.length(); i++) {
            list.push(w.charAt(i));
        }

        for(int i = 0; i < w.length(); i++){
            System.out.print(list.pop());
        }
    }
}
