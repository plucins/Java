package struktury.liczbaZnakowWNapisie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();
        List<String> strings = new ArrayList<>();
        strings.add("kolorowanka");
        strings.add("piernik");
        strings.add("miernik kolegi");
        strings.add("miernik kolegi");
        strings.add("miernik kolegi");
        strings.add("tandemem przez tajge");

        for(String s: strings){
            if(c.czyJestWCache(s)){
                c.pobierzWartoscZCache(s);
            }else {
                c.ileUnikalnych(s);
            }
        }

        c.wyswietlWyrazy();

    }
}
