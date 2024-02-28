package ru.ibs.positive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ibs.base.BaseTest;
import ru.ibs.task.six.exception.CalculatorException;

public class DivTestDoubleData extends BaseTest {
    @Test
    public void testDiv() throws CalculatorException {
        Assertions.assertEquals(5.0, calculator.makeCalculation(10.0, 2.0, '/'),
                "Деление работает неверное");
    }
}
