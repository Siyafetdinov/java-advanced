package ru.ibs.task.five;

import ru.ibs.constants.ColorANSI;
import ru.ibs.menu.MainMenu;
import ru.ibs.task.five.utils.UtilsTaskFive;
import ru.ibs.utils.UtilsMenu;

import java.util.*;

/**
 * Задание 5.
 * Есть входной файл с набором слов, написанных через пробел
 * Необходимо:
 * Прочитать слова из файла.
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле
 * Вывести статистику на консоль
 * Найти слово с максимальным количеством повторений
 * Вывести на консоль это слово и сколько раз оно встречается в файле
 */
public class TaskFive {

    private static final String PATH_FILE = "src/main/resources/Lorem ipsum.txt";
    private static List<String> listWords = UtilsTaskFive.getTextFromFile(PATH_FILE);


    /**
     * Метод выполняет Задание 5
     */
    public static void startTask() {
        System.out.println("\nМы открыли файл: " + ColorANSI.PURPLE + PATH_FILE + ColorANSI.RESET +
                "\nИ получили список слов: " + ColorANSI.YELLOW + listWords + ColorANSI.RESET);
        UtilsMenu.exitMenu();

        Collections.sort(listWords);
        System.out.println("\nОтсортированный список слов: " + ColorANSI.GREEN + listWords + ColorANSI.RESET);
        UtilsMenu.exitMenu();

        System.out.println(ColorANSI.CYAN + "Посчитать сколько раз каждое слово встречается в файле: \n" +
                ColorANSI.RESET + UtilsTaskFive.getStringCountsWord(UtilsTaskFive.getSortHashMap(listWords)));
        UtilsMenu.exitMenu();

        System.out.println(ColorANSI.CYAN + "Слова которые встречаются в тексте чаще всего: \n" + ColorANSI.RESET +
                UtilsTaskFive.getStringCountsWord(UtilsTaskFive.getWordsMaximumRepetition(listWords)));

        UtilsMenu.exitMenu();
        MainMenu.startHandler();
    }
}
