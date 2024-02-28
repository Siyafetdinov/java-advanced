package ru.ibs.utils;

import ru.ibs.constants.ColorANSI;

/**
 * Utils класс. Для работы с меню
 */
public class UtilsMenu {

    /**
     * Метод отображает меню на экране
     *
     * @param heading заголовок меню
     * @param item    пункты менгю
     */
    public static void displayMenu(String heading, String[] item) {
        System.out.println(ColorANSI.CYAN + "\n" + heading + "\n" + ColorANSI.RESET);
        for (int i = 0; i < item.length; i++) {
            System.out.println((i + 1) + ". " + item[i]);
        }
    }

    /**
     * Метод для продолжения работы. Используется в ситуациях, где есть важные предупреждения/результаты
     */
    public static void exitMenu() {
        System.out.println("Для продолжения нажмите Enter");
        UtilsScanner.getStringConsole();
    }

    /**
     * Универсальный метод для меню, когда пользователь выбирает несуществующий пункт
     */
    public static void menuNotElement() {
        System.out.println("\n------------------------" + ColorANSI.YELLOW + "\nПункт не найден. " + ColorANSI.RESET);
        exitMenu();
    }
}
