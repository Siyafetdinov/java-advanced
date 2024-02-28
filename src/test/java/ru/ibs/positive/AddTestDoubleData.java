package ru.ibs.positive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ibs.base.BaseTest;
import ru.ibs.task.six.exception.CalculatorException;

public class AddTestDoubleData extends BaseTest {
    @Test
    public void testSum() throws CalculatorException {
        Assertions.assertEquals(12.0, calculator.makeCalculation(10.0, 2.0, '+'),
                "Сложение работает неверное");
    }
}
