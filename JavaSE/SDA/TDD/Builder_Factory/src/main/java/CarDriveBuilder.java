public abstract class CarDriveBuilder extends Builder<Car> {
    Builder<Car> setDrive(Drive drive) {
        product.setDriveType(drive);
        return this;
    }
}
