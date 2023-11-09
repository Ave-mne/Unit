package HW3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEnteringTheInterval {
    private final EnteringTheInterval enteringTheInterval = new EnteringTheInterval();

    @Test
    public void testNumbersInInterval_numberInRange(){
        int number = 30;
        boolean result = enteringTheInterval.numbersInInterval(number);
        Assertions.assertTrue(result);
    }

    @Test
    public void testNumbersInInterval_numberOutRange(){
        int number = 24;
        boolean result = enteringTheInterval.numbersInInterval(number);
        Assertions.assertFalse(result);
    }
}
