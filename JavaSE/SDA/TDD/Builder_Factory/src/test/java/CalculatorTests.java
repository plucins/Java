import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {
    @Test
    public void sum_a6b7_13() {
        int expected = 13;
        Calculator calculator = new Calculator();

        int actual = calculator.sum(6, 7);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divide_a1b1_1(){
        int expected = 1;

        int actual = Calculator.divide(1,1);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void builder(){

    }
}
