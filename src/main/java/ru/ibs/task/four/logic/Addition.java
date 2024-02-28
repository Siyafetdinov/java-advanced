package ru.ibs.task.four.logic;

import ru.ibs.task.four.interfaces.IOperation;

public class Addition implements IOperation {
    @Override
    public Double performOperation(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
}
