package Shape;

public class Circle implements IShape {

    double promien;

    public Circle(double promien) {
        this.promien = promien;
    }

    @Override
    public double calculateArea() {
        return 2*PI*this.promien;
    }

    @Override
    public double calculateCircumference() {
        return PI*Math.pow(2,this.promien);
    }

    @Override
    public void print() {

    }
}
