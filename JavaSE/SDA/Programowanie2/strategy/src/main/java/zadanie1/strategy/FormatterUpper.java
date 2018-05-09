package zadanie1.strategy;

import zadanie1.IFormatterCzcionki;

public class FormatterUpper implements IFormatterCzcionki {

    public String zmienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.toUpperCase();
    }
}
