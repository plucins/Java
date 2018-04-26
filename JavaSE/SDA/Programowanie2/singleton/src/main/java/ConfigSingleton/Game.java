package ConfigSingleton;

import java.util.Random;

public class Game {

    public int getNumber(int to){
        return new Random().nextInt(to)+1;
    }

    public String getAction(String s){
        String[] actions = s.split("");
        int rnd = new Random().nextInt(actions.length);
        return actions[rnd];
    }


}
