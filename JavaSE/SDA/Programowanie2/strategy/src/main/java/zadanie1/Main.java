package zadanie1;

import zadanie1.strategy.FormatterInverter;
import zadanie1.strategy.FormatterSplitter;

public class Main {
    public static void main(String[] args) {
        IFormatterCzcionki formatter = new FormatterSplitter();

        System.out.println(formatter.zmienTekst("AsdASdasdasDAsdaSD"));
    }
}
