public abstract class BaseCarBuilder extends CarDriveBuilder implements CarMarkBuilder,CarBodyBuilder,CarColorBuilder {
    public CarColorBuilder setBody(Body body) {
        product.setBodyType(body);
        return this;
    }

    public CarDriveBuilder setColor(Color color) {
        product.setBodyColor(color);
        return this;
    }

    public CarDriveBuilder setDrive(Drive drive) {
        product.setDriveType(drive);
        return this;
    }
}
