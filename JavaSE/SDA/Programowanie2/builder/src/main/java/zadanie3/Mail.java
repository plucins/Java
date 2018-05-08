package zadanie3;

import java.time.LocalDate;

public class Mail {
    private String tresc;
    private LocalDate dataNadania;
    private LocalDate dataOdbioru;
    private String ipNadania;
    private String ipOdbioru;
    private String nazwaSerweraPosredniczacego;
    private String nazwaSkrzynkiPocztowej;
    private String protokolKomunikacji;
    private TypWiadomosci typWiadomosci;
    private boolean szyfrowac;
    private boolean spam;

    public void setDataOdbioru(LocalDate dataOdbioru) {
        this.dataOdbioru = dataOdbioru;
    }

    public Mail(String tresc, LocalDate dataNadania, LocalDate dataOdbioru, String ipNadania, String ipOdbioru, String nazwaSerweraPosredniczacego, String nazwaSkrzynkiPocztowej, String protokolKomunikacji, TypWiadomosci typWiadomosci, boolean szyfrowac, boolean spam) {
        this.tresc = tresc;
        this.dataNadania = dataNadania;
        this.dataOdbioru = dataOdbioru;
        this.ipNadania = ipNadania;
        this.ipOdbioru = ipOdbioru;
        this.nazwaSerweraPosredniczacego = nazwaSerweraPosredniczacego;
        this.nazwaSkrzynkiPocztowej = nazwaSkrzynkiPocztowej;
        this.protokolKomunikacji = protokolKomunikacji;
        this.typWiadomosci = typWiadomosci;
        this.szyfrowac = szyfrowac;
        this.spam = spam;
    }

    public static class Builder{

        private String tresc;
        private LocalDate dataNadania;
        private LocalDate dataOdbioru;
        private String ipNadania;
        private String ipOdbioru;
        private String nazwaSerweraPosredniczacego;
        private String nazwaSkrzynkiPocztowej;
        private String protokolKomunikacji;
        private TypWiadomosci typWiadomosci;
        private boolean szyfrowac;
        private boolean spam;

        public Builder setTresc(String tresc) {
            this.tresc = tresc;
            return this;
        }

        public Builder setDataNadania(LocalDate dataNadania) {
            this.dataNadania = dataNadania;
            return this;
        }

        public Builder setDataOdbioru(LocalDate dataOdbioru) {
            this.dataOdbioru = dataOdbioru;
            return this;
        }

        public Builder setIpNadania(String ipNadania) {
            this.ipNadania = ipNadania;
            return this;
        }

        public Builder setIpOdbioru(String ipOdbioru) {
            this.ipOdbioru = ipOdbioru;
            return this;
        }

        public Builder setNazwaSerweraPosredniczacego(String nazwaSerweraPosredniczacego) {
            this.nazwaSerweraPosredniczacego = nazwaSerweraPosredniczacego;
            return this;
        }

        public Builder setNazwaSkrzynkiPocztowej(String nazwaSkrzynkiPocztowej) {
            this.nazwaSkrzynkiPocztowej = nazwaSkrzynkiPocztowej;
            return this;
        }

        public Builder setProtokolKomunikacji(String protokolKomunikacji) {
            this.protokolKomunikacji = protokolKomunikacji;
            return this;
        }

        public Builder setTypWiadomosci(TypWiadomosci typWiadomosci) {
            this.typWiadomosci = typWiadomosci;
            return this;
        }

        public Builder setSzyfrowac(boolean szyfrowac) {
            this.szyfrowac = szyfrowac;
            return this;
        }

        public Builder setSpam(boolean spam) {
            this.spam = spam;
            return this;
        }

        public Mail createMail() {
            return new Mail(tresc, dataNadania, dataOdbioru, ipNadania, ipOdbioru, nazwaSerweraPosredniczacego, nazwaSkrzynkiPocztowej, protokolKomunikacji, typWiadomosci, szyfrowac, spam);
        }
    }
}
