package ru.ibs.task.six.calculator;

import ru.ibs.task.six.exception.CalculatorException;
import ru.ibs.task.six.logic.Addition;
import ru.ibs.task.six.logic.Division;
import ru.ibs.task.six.logic.Multiplication;
import ru.ibs.task.six.logic.Subtraction;

public class Calculator {

    public double makeCalculation(double firstNumber, double secondNumber, char operation) throws CalculatorException {
        switch (operation) {
            case '-': {
                return new Subtraction().performOperation(firstNumber, secondNumber);
            }
            case '+': {
                return new Addition().performOperation(firstNumber, secondNumber);
            }
            case '*': {
                return new Multiplication().performOperation(firstNumber, secondNumber);
            }
            case '/': {
                return new Division().performOperation(firstNumber, secondNumber);
            }
            default: {
                throw new CalculatorException("Такой операции не существует!");
            }
        }
    }

}
