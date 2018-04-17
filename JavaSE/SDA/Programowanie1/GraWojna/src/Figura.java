public enum  Figura {
    DWOJKA(2),
    TROJKA(3),
    CZWORKA(4),
    PIATKA(5),
    SZOSTKA(6),
    SIUDEMKA(7),
    OSEMKA(8),
    DZIEWIATKA(9),
    DZIESIATKA(10),
    JUPEK(11),
    DAMA(12),
    KROL(13),
    AS(14);

    private int waga;

    Figura(int waga) {
        this.waga = waga;
    }

    public int getWaga() {
        return waga;
    }
}
