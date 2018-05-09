package zadanie3;

public class Samochod {
    private double speed;
    private double engineWear;
    private double breaksWear;
    private double gasRelease;
    private CarType carType;

    public void increaseSpeed(){
        this.engineWear += carType.zwiekszZuzycieSilnika();
        this.gasRelease += carType.zwiekszgasReleased();
        this.speed =+ carType.zwiekszPredkosc();
    }

    public void decreaseSpeed(){
        this.breaksWear += carType.zwiekszZuzycieHamulcow();
        this.breaksWear += carType.zmniejszPredkosc();
    }
}
