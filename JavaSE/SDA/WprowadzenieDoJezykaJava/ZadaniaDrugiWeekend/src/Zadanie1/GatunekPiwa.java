package Zadanie1;

public enum GatunekPiwa {
    LAGER("Jasne"),
    PILZNER("Jasne"),
    STOUT("Ciemne"),
    PORTER("Ciemne"),
    MIODOWE("Jasne");

    String rodzaj;


    GatunekPiwa(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    void opisPiwa() {
        System.out.println("Piwo " + this.toString().substring(0, 1).toUpperCase() +
                this.toString().substring(1).toLowerCase() + " (" + getRodzaj() + ")");
    }

}
