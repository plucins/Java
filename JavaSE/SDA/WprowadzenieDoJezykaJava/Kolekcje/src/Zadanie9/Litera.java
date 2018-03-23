package Zadanie9;

import java.util.*;
import java.util.stream.Collectors;

public class Litera {
    private char znak;

    public Litera() {
    }

    public Litera(char znak) {
        this.znak = znak;
    }

    public char getZnak() {
        return znak;
    }

    public void setZnak(char znak) {
        this.znak = znak;
    }

    @Override
    public String toString() {
        return "Litera{" +
                "znak=" + znak +
                '}';
    }

    public List<Litera> getAllLetters(){
        List<Litera> letters = new ArrayList<>();
        for(char i = 'a'; i < 'z'; i++) {
            letters.add(new Litera(i));
        }

        return letters;
    }

    public void printLetters(List<Litera> letters){
        letters.stream().forEach(System.out::println);
    }

    public boolean isListContains(List<Litera> letters){
        List<Character> lettersTocheck = new ArrayList<>(Arrays.asList('a','ą','x','z','ź','ż'));
        return letters.stream().map(u->u.getZnak())
                .anyMatch(lettersTocheck::contains);
    }

    public boolean isStringContainsOnlyPolishAlphabetCharts(String string){
        return Arrays.stream(string.split(""))
                .allMatch(getAllLetters()::contains);
    }

    public <T>Set<T> newSet(T... numbers){
        Set<T> uniqueNumbers = new HashSet<>();
        for(T n: numbers){
            if(!uniqueNumbers.add(n)) throw new IllegalArgumentException();
        }
        return uniqueNumbers;
    }



    public <T>List<T> mergeLists(List<T>... lists){
        return Arrays.stream(lists).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public <T>Set<T> mergeSet(List<T>... lists){
        return Arrays.stream(lists).flatMap(Collection::stream).collect(Collectors.toSet());
    }
}
