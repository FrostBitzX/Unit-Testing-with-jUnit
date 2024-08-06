package util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void createObject(){
        calculator = new Calculator();
    }

    //test Zero
    @Test
    void testPowerBaseZeroPowerNegative() {
        assertEquals(-1,calculator.power(0,-1));
        //assertThrows(ArithmeticException.class, () -> calculator.power(0,-1));
    }
    @Test
    void testPowerBaseZeroPowerZero(){
        assertEquals(1,calculator.power(0,0));
    }
    @Test
    void testPowerBaseZeroPowerOne(){
        assertEquals(0, calculator.power(0,1));
    }

    //test Positive
    @Test
    void testPowerBasePositivePowerNegative(){
        assertEquals(-1,calculator.power(5,-1));
    }
    @Test
    void testPowerBasePositivePowerZero(){
        assertEquals(1,calculator.power(5,0));
    }
    @Test
    void testPowerBasePositivePowerOne(){
        assertEquals(5, calculator.power(5,1));
    }

    //test Negative
    @Test
    void testPowerBaseNegativePowerNegative(){
        assertEquals(-1, calculator.power(-5,-1));
    }
    @Test
    void testPowerBaseNegativePowerZero(){
        assertEquals(1, calculator.power(-5,0));
    }
    @Test
    void testPowerBaseNegativePowerPositive(){
        assertEquals(-5, calculator.power(-5,1));
    }




}
