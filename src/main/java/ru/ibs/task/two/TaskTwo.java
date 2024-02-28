package ru.ibs.task.two;

import ru.ibs.constants.ColorANSI;
import ru.ibs.menu.MainMenu;
import ru.ibs.utils.UtilsMenu;
import ru.ibs.utils.UtilsScanner;
import ru.ibs.task.two.utils.UtilsTaskTwo;

import java.util.Arrays;

/**
 * Задание 2.
 * Поиск максимального элемента в массиве:
 * - задаем массив слов
 * - размерность массива произвольна, задается в консоли
 * - после чего в консоли вводятся слова в количестве равном заданной длине массива
 * - в полученном массиве необходимо найти самое длинное слово
 * - результат вывести на консоль
 */
public class TaskTwo {

    /**
     * Метод выполняет Задание 2
     */
    public static void startTask() {

        System.out.println(ColorANSI.YELLOW + "\nЗадайте размер массива" + ColorANSI.RESET);
        String[] array = UtilsTaskTwo.getArrayWord(UtilsScanner.getIntFromInput(2, 10));
        String[] result = UtilsTaskTwo.getAllLongWords(array);

        System.out.println(ColorANSI.PURPLE + "\n\nИсходный массив: " + ColorANSI.RESET +
                Arrays.toString(array));
        if (result.length > 1) {
            System.out.println("В заданном масиве было несколько слов с самой большой длинной: " + ColorANSI.GREEN
                    + Arrays.toString(result) + ColorANSI.RESET + "\n");
        } else {
            System.out.println("Самое большое слово в массиве: " + ColorANSI.GREEN + result[0]
                    + ColorANSI.RESET + "\n");
        }

        UtilsMenu.exitMenu();
        MainMenu.startHandler();
    }
}
