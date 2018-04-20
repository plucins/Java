public class AudiFactory implements Factory<Car> {
    private CarBuilder builder;

    public AudiFactory(CarBuilder builder){
        this.builder = builder;
        this.builder.setMark(Mark.Audi);
    }

    public Car CreateCar(Month month) {

        switch (month){
            case January:
                builder.setBody(Body.Hybrid).setColor(Color.Red).setDrive(Drive.Diesel);
                break;
            case February:
                builder.setBody(Body.CertifiedPreOwned).setColor(Color.AliceBlue).setDrive(Drive.Diesel);
                break;
            case March:
                builder.setBody(Body.Convertible).setColor(Color.Aquamarine).setDrive(Drive.Diesel);
                break;
            case April:
                builder.setBody(Body.Crossover).setColor(Color.AntiqueWhite).setDrive(Drive.Diesel);
                break;
            case May:
                builder.setBody(Body.Diesel).setColor(Color.Azure).setDrive(Drive.Diesel);
                break;
            case June:
                builder.setBody(Body.Luxury).setColor(Color.Beige).setDrive(Drive.Diesel);
                break;
            case July:
                builder.setBody(Body.Sedan).setColor(Color.Bisque).setDrive(Drive.Diesel);
                break;
            case August:
                builder.setBody(Body.Sport).setColor(Color.Black).setDrive(Drive.Diesel);
                break;
            case September:
                builder.setBody(Body.SUV).setColor(Color.BlanchedAlmond).setDrive(Drive.Diesel);
                break;
            case October:
                builder.setBody(Body.Truck).setColor(Color.Blue).setDrive(Drive.Diesel);
                break;
            case November:
                builder.setBody(Body.Hybrid).setColor(Color.Red).setDrive(Drive.Diesel);
                break;
            case December:
                builder.setBody(Body.Van).setColor(Color.Red).setDrive(Drive.Diesel);
                break;
        }

        return this.builder.Build();
    }
}
