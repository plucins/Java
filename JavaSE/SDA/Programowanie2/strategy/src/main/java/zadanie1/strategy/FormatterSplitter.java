package zadanie1.strategy;

import zadanie1.IFormatterCzcionki;

public class FormatterSplitter implements IFormatterCzcionki {

    public String zmienTekst(String tekstDoZmiany) {
        String result = "";
        for(int i = 0; i < tekstDoZmiany.trim().length(); i++){
            result += tekstDoZmiany.charAt(i) + " ";
        }
        return result;
    }
}
