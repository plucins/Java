package pralka;

public class DlugiePranie implements ITrybPracy {

    @Override
    public ParametryPralki[] getEtapy() {
        return new ParametryPralki[]{
                new ParametryPralki(0,200,"ProgramPierwszy",1000),
                new ParametryPralki(200,100,"Drugi program",1000),
                new ParametryPralki(50,10,"Trzeci program",500),
                new ParametryPralki(400,1,"Czwarty program",400),
                new ParametryPralki(500,1,"Piąty program",5000),
                new ParametryPralki(100,2,"Ostatnie etap",5000),
        };
    }
}
