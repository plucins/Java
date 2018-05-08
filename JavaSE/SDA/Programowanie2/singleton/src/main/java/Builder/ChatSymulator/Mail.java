package Builder.ChatSymulator;

import java.time.LocalDate;

public class Mail {
    private String tresc;
    private String nadawca;
    private LocalDate dataNadania;
    private LocalDate dataOdbioru;
    private String ipAdressNadawcy;
    private String ipAdressOdbiorcy;
    private String nazwaSerweraPosredniego;
    private String nazwaSkrzynkiPocztowej;
    private String protokolKomunikacji;
    private TypWiadomosci typWiadomosci;
    private boolean czySzyfrowac;
    private boolean isSpam;

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public String getNadawca() {
        return nadawca;
    }

    public void setNadawca(String nadawca) {
        this.nadawca = nadawca;
    }

    public LocalDate getDataNadania() {
        return dataNadania;
    }

    public void setDataNadania(LocalDate dataNadania) {
        this.dataNadania = dataNadania;
    }

    public LocalDate getDataOdbioru() {
        return dataOdbioru;
    }

    public void setDataOdbioru(LocalDate dataOdbioru) {
        this.dataOdbioru = dataOdbioru;
    }

    public String getIpAdressNadawcy() {
        return ipAdressNadawcy;
    }

    public void setIpAdressNadawcy(String ipAdressNadawcy) {
        this.ipAdressNadawcy = ipAdressNadawcy;
    }

    public String getIpAdressOdbiorcy() {
        return ipAdressOdbiorcy;
    }

    public void setIpAdressOdbiorcy(String ipAdressOdbiorcy) {
        this.ipAdressOdbiorcy = ipAdressOdbiorcy;
    }

    public String getNazwaSerweraPosredniego() {
        return nazwaSerweraPosredniego;
    }

    public void setNazwaSerweraPosredniego(String nazwaSerweraPosredniego) {
        this.nazwaSerweraPosredniego = nazwaSerweraPosredniego;
    }

    public String getNazwaSkrzynkiPocztowej() {
        return nazwaSkrzynkiPocztowej;
    }

    public void setNazwaSkrzynkiPocztowej(String nazwaSkrzynkiPocztowej) {
        this.nazwaSkrzynkiPocztowej = nazwaSkrzynkiPocztowej;
    }

    public String getProtokolKomunikacji() {
        return protokolKomunikacji;
    }

    public void setProtokolKomunikacji(String protokolKomunikacji) {
        this.protokolKomunikacji = protokolKomunikacji;
    }

    public TypWiadomosci getTypWiadomosci() {
        return typWiadomosci;
    }

    public void setTypWiadomosci(TypWiadomosci typWiadomosci) {
        this.typWiadomosci = typWiadomosci;
    }

    public boolean isCzySzyfrowac() {
        return czySzyfrowac;
    }

    public void setCzySzyfrowac(boolean czySzyfrowac) {
        this.czySzyfrowac = czySzyfrowac;
    }

    public boolean isSpam() {
        return isSpam;
    }

    public void setSpam(boolean spam) {
        isSpam = spam;
    }

    public Mail(Builder builder) {
        this.tresc = tresc;
        this.nadawca = nadawca;
        this.dataNadania = dataNadania;
        this.dataOdbioru = dataOdbioru;
        this.ipAdressNadawcy = ipAdressNadawcy;
        this.ipAdressOdbiorcy = ipAdressOdbiorcy;
        this.nazwaSerweraPosredniego = nazwaSerweraPosredniego;
        this.nazwaSkrzynkiPocztowej = nazwaSkrzynkiPocztowej;
        this.protokolKomunikacji = protokolKomunikacji;
        this.typWiadomosci = typWiadomosci;
        this.czySzyfrowac = czySzyfrowac;
        this.isSpam = isSpam;
    }

    public static class Builder{
        private String tresc;
        private String nadawca;
        private LocalDate dataNadania;
        private LocalDate dataOdbioru;
        private String ipAdressNadawcy;
        private String ipAdressOdbiorcy;
        private String nazwaSerweraPosredniego;
        private String nazwaSkrzynkiPocztowej;
        private String protokolKomunikacji;
        private TypWiadomosci typWiadomosci;
        private boolean czySzyfrowac;
        private boolean isSpam;

        public Builder() {
        }

        public Builder setTresc(String tresc) {
            this.tresc = tresc;
            return this;
        }

        public Builder setNadawca(String nadawca) {
            this.nadawca = nadawca;
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

        public Builder setIpAdressNadawcy(String ipAdressNadawcy) {
            this.ipAdressNadawcy = ipAdressNadawcy;
            return this;
        }

        public Builder setIpAdressOdbiorcy(String ipAdressOdbiorcy) {
            this.ipAdressOdbiorcy = ipAdressOdbiorcy;
            return this;
        }

        public Builder setNazwaSerweraPosredniego(String nazwaSerweraPosredniego) {
            this.nazwaSerweraPosredniego = nazwaSerweraPosredniego;
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

        public Builder setCzySzyfrowac(boolean czySzyfrowac) {
            this.czySzyfrowac = czySzyfrowac;
            return this;
        }

        public Builder setSpam(boolean spam) {
            isSpam = spam;
            return this;
        }

        public Mail build(){
            return new Mail(this);
        }
    }
}
