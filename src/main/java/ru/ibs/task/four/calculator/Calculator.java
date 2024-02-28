package ru.ibs.task.four.calculator;

import ru.ibs.task.four.logic.Addition;
import ru.ibs.task.four.logic.Division;
import ru.ibs.task.four.logic.Multiplication;
import ru.ibs.task.four.logic.Subtraction;

public class Calculator {

    public double makeCalculation(double firstNumber, double secondNumber, char operation) {
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
                System.out.println("Что-то пошло не по плану");
                return 0;
            }
        }
    }

}
