package HW3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestParityCheck {
    private final ParityCheck parityCheck = new ParityCheck();

    @Test
    public void testEvenOddNumber_EvenNumber(){
        int number = 4;
        boolean result = parityCheck.evenOddNumber(number);
        Assertions.assertTrue(result);
    }

    @Test
    public void testEvenOddNumber_OddNumber(){
        int number = 5;
        boolean result = parityCheck.evenOddNumber(number);
        Assertions.assertFalse(result);
    }

}
