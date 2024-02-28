package ru.ibs.task.six.logic;

import ru.ibs.constants.ColorANSI;
import ru.ibs.task.six.interfaces.IOperation;

import java.awt.*;
import java.io.IOException;

public class Division implements IOperation {
    @Override
    public Double performOperation(double firstValue, double secondValue) {
        try {
            if (secondValue == 0) {
                throw new ArithmeticException(ColorANSI.RED + "Деление на ноль недопустимо!" + ColorANSI.RESET);
            }
            return firstValue / secondValue;
        } catch (ArithmeticException e) {
            System.out.println("Исключение: " + e);
            return 0.0;
        }
    }
}
