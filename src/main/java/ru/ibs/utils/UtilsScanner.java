package ru.ibs.utils;

import ru.ibs.constants.ColorANSI;

import java.util.Scanner;

/**
 * Utils класс. Для работы со сканером
 */
public class UtilsScanner {

    /**
     * Метод позволяет получить строку, введенную пользователем в консоль.
     *
     * @return строка
     */
    public static String getStringConsole() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    /**
     * Метод для получения числа из строки. С проверкой на некорректный ввод
     * Может быть как отрицательным, так и положительным
     *
     * @return число введеное в консоль.
     */
    public static int getIntFromInput() {
        String str = getStringConsole();
        while (!str.matches("-?\\d*")) {
            System.out.println(ColorANSI.RED + "Ошибка, вы ввели не число! Потворите снова!" + ColorANSI.RESET);
            str = getStringConsole();
        }

        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return getIntFromInput();
        }
    }

    /**
     * Метод для получения числа из строки. С проверкой на некорректный ввод
     * С проверкой минмальное и максимальное значение.
     *
     * @param min минимальное значение
     * @param max максимальное значение
     * @return число введеное в консоль.
     */
    public static int getIntFromInput(int min, int max) {
        System.out.println("Введите число от " + min + " до " + max);
        int value = getIntFromInput();
        while (value > max || value < min) {
            System.out.println(ColorANSI.RED + "Ошибка! Повторите снова! " + ColorANSI.RESET +
                    "Введите число от " + min + " до " + max);
            value = getIntFromInput();
        }
        return value;
    }

    /**
     * Метод для получения дробного числа из строки. С проверкой на некорректный ввод
     * Может быть как отрицательным, так и положительным
     *
     * @return число введеное в консоль.
     */
    public static double getDoubleFromInput() {
        String str = getStringConsole();
        while (!str.matches("^(-?\\d+[.,]?\\d*)$")) {
            System.out.println(ColorANSI.RED + "Ошибка! Повторите снова!" + ColorANSI.RESET);
            str = getStringConsole();
        }
        return Double.parseDouble(str.replace(",", "."));
    }

    public static String getWordFromInput() {
        System.out.println("Введите слово. Доступные символы: a-z, A-Z, а-я, А-Я");
        String str = getStringConsole();
        while (!str.matches("^[a-zA-zА-Яа-я]*")) {
            System.out.println(ColorANSI.RED + "Ошибка! Повторите снова!" + ColorANSI.RESET);
            str = getStringConsole();
        }
        return str;
    }

}
