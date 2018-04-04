package struktury.liczbaZnakowWNapisie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Controller {
    private Map<String, Integer> cache = new HashMap<>();

    public int ileUnikalnych(String s){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }
        cache.put(s,set.size());

        return set.size();
    }

    public boolean czyJestWCache(String s){
        return cache.containsKey(s);
    }

    public int pobierzWartoscZCache(String s){
        return cache.get(s);
    }

    public void wyswietlWyrazy(){
        for(String s: cache.keySet()){
            System.out.println(s + " unikalnych " + cache.get(s));
        }
    }
}
