package calculator;

import calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 7.12.2018
 * Time: 14:31
 * Project Name: unit-test-1
 */

public class CalculatorTest {

    @Test
    public void sumTest() throws Exception {
        // Prepary ready
        Calculator calculator = new Calculator();

        int num1 = 5;
        int num2 = 6;

        // Run method
        int result = calculator.sum( num1 , num2 );

        // Control result

        Assert.assertEquals( 11, result );
    }

    @Test
    public void minusTest() throws Exception{

        Calculator calculator = new Calculator();

        int num1 = 89;
        int num2 = 34;

        int result = calculator.minus( num1, num2 );

        Assert.assertEquals( 55, result );
    }

    @Test
    public void divisionTest() throws NullPointerException {

        Calculator calculator = new Calculator();

        Assert.assertEquals( 2, calculator.division( 30, 15 ));

    }
}