public class CarBuilder extends BaseCarBuilder {
    public CarBodyBuilder setMark(Mark mark) {
        product.setMark(mark);
        return this;
    }
}
