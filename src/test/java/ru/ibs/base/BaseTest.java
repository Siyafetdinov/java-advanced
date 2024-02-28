package ru.ibs.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.ibs.task.six.calculator.Calculator;
import ru.ibs.task.three.product.logic.Product;

public class BaseTest {
    protected Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }
}
