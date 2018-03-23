package Shape;

public class Square implements IShape {

    double bok;

    public Square(double bok) {
        this.bok = bok;
    }

    @Override
    public double calculateArea() {
        return Math.pow(2,this.bok);
    }

    @Override
    public double calculateCircumference() {
        return 4*this.bok;
    }

    @Override
    public void print() {
        for(int i = 0; i < bok ; i++){
            for(int j = 0; j< bok; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
