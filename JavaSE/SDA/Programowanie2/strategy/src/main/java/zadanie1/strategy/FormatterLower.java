package zadanie1.strategy;

import zadanie1.IFormatterCzcionki;

public class FormatterLower implements IFormatterCzcionki {
    public String zmienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.toLowerCase();
    }
}
