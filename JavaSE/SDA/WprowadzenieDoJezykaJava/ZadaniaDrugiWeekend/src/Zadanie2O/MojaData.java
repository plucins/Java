package Zadanie2O;

public class MojaData {
    int dzien;
    int miesiac;
    int rok;

    public MojaData(int dzien, int miesiac, int rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    protected String wyswietlDateA(){
        return this.dzien+"."+this.miesiac+"."+this.rok;
    }

    protected String wyswietlDateB(){
        String dzien;
        if(this.dzien < 10){
            dzien = "0"+this.dzien;
        }else {
            dzien = ""+this.dzien;
        }
        return dzien+"."+this.miesiac+"."+this.rok;
    }

    protected String wyswietlDateC(){
        String[] miesiac = new String[]{"sty","lut","marz","kwi","maj","cze","lip","sie","wrz","paz","lis","gru"};

        return this.dzien+" "+miesiac[this.miesiac-1]+" "+this.rok;
    }
}
