package zadanie1;

public class Tekt {
    private String tresc;
    private IFormatterCzcionki formater;

    public Tekt(String tresc) {
        this.tresc = tresc;
    }

    public void setFormater(IFormatterCzcionki formater) {
        this.formater = formater;
    }
}
