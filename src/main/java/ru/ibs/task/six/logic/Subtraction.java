package ru.ibs.task.six.logic;

import ru.ibs.task.six.interfaces.IOperation;

public class Subtraction implements IOperation {
    @Override
    public Double performOperation(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }
}
