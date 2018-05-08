package zadanie1.Computer;

public abstract class ComputerFactory {

    public static AsusPC creatAsusZenBook(){
        return new AsusPC("tekst",6,2.0,false);
    }

    public static AsusPC createVivoBook(){
        return new AsusPC("tekst",2,3.0,true);
    }

    public static HpPC createHpPavilion(){
        return new HpPC("tekst",4,0.9,false);
    }

    public static HpPC createHpLiteBook(){
        return new HpPC("tekst",1,1.0,false);
    }

    public static SamsungPC createSamsungNotebook(){
        return new SamsungPC("teks", 5,2.2,false);
    }

    public static SamsungPC createSamsungChromebook(){
        return new SamsungPC("test",2,1.1,true);
    }
}
