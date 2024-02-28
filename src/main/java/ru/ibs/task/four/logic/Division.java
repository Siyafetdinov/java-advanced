package ru.ibs.task.four.logic;

import ru.ibs.constants.ColorANSI;
import ru.ibs.task.four.interfaces.IOperation;

public class Division implements IOperation {
    @Override
    public Double performOperation(double firstValue, double secondValue) {
        if (secondValue == 0) {
            System.out.println(ColorANSI.RED + "Делить на ноль нельзя!" + ColorANSI.RESET);
            return (double) 0;
        }
        return firstValue / secondValue;
    }
}
