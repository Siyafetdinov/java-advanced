package ru.ibs.task.six;

import ru.ibs.constants.ColorANSI;
import ru.ibs.menu.MainMenu;
import ru.ibs.task.six.calculator.Calculator;
import ru.ibs.task.six.exception.CalculatorException;
import ru.ibs.utils.UtilsMenu;
import ru.ibs.utils.UtilsScanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 6. Добавить обработку исключений в задание с ООП калькулятора (например, исключение может возникнуть при делении на ноль)
 */
public class TaskSix {
    private static String REGEX = "^(-?\\d+[.,]?\\d*)([*\\/+-])(-?\\d+[.,]?\\d*)$";

    /**
     * Метод выполняет Задание 6
     */
    public static void startTask() {

        Calculator calculator = new Calculator();

        System.out.println("Введите формулу которую хотите посчитать.\n" + ColorANSI.PURPLE +
                "Допустимый ввод значений: 2.0 | 2,0 | -2.0 | -2,0 | 2 | -2 |" + ColorANSI.YELLOW +
                "\nПримеры ввода расчета: 2+2 | 2,0/2.0 | -2.0*-2 |" + ColorANSI.RESET);

        String str = UtilsScanner.getStringConsole();
        while (!str.matches(REGEX)) {
            System.out.println(ColorANSI.RED + "Ошибка! Потворите снова!" + ColorANSI.RESET);
            str = UtilsScanner.getStringConsole();
        }

        Matcher matcher = Pattern.compile(REGEX).matcher(str);
        if (matcher.find()) {

            System.out.println(ColorANSI.PURPLE + "\nРасчет: " + ColorANSI.RESET + str);

            double result = 0;
            try {
                result = calculator.makeCalculation(
                        Double.parseDouble(matcher.group(1).replace(",", ".")),
                        Double.parseDouble(matcher.group(3).replace(",", ".")),
                        matcher.group(2).charAt(0));
            } catch (CalculatorException e) {
                throw new RuntimeException(e);
            }

            System.out.println(ColorANSI.GREEN + "Результат: " + String.format("%.2f", result) + ColorANSI.RESET + "\n");
        }

        UtilsMenu.exitMenu();
        MainMenu.startHandler();
    }
}
