package ru.ibs.task.three;

import ru.ibs.constants.ColorANSI;
import ru.ibs.menu.MainMenu;
import ru.ibs.task.three.product.logic.Product;
import ru.ibs.task.three.product.utils.UtilsProduct;
import ru.ibs.utils.UtilsMenu;
import ru.ibs.utils.UtilsScanner;
import ru.ibs.task.three.utils.UtilsTaskThree;

import java.util.Arrays;

/**
 * Задание №3_Массивы.
 * 1.
 * - Массив размерностью 20
 * - Он заполняется случайными целыми числами от -10 до 10
 * - Нужно найти максимальный отрицательный и минимальный положительный элементы массива
 * - Поменять их местами.
 * 2. Формируется сладкий подарок.
 * - Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * - У каждой сладости есть название, вес, цена и свой уникальный параметр
 * - Необходимо собрать подарок из сладостей
 * - Найти общий вес подарка, общую стоимость подарка
 * - Вывести на консоль информацию о всех сладостях в подарке
 */
public class TaskThree {

    private static final String[] menuItem = {
            "Найти максимальный отрицательный и " +
                    "минимальный положительный элементы массива. Поменять их местами",
            "Сформировать сладкий подарок",
            "Выйти в главное меню"
    };

    /**
     * Метод запускает меню Задания 3
     */
    public static void startTask() {
        menu();
    }

    /**
     * Метод отображает меню Задания 3 на экране. Получает значение из консоли и отправляет в обработчик
     */
    private static void menu() {
        UtilsMenu.displayMenu("Работа с массивами. Выберите задание:", menuItem);
        menuHandler(UtilsScanner.getIntFromInput());
    }

    private static void menuHandler(int valueMenu) {
        switch (valueMenu) {
            default: {
                UtilsMenu.menuNotElement();
                menu();
                break;
            }
            case 1: {
                completeFirstTask();
                UtilsMenu.exitMenu();
                menu();
                break;
            }
            case 2: {
                completeSecondTask();
                UtilsMenu.exitMenu();
                menu();
                break;
            }
            case 3: {
                MainMenu.startHandler();
                break;
            }
        }
    }

    private static void completeFirstTask() {
        int[] arr = UtilsTaskThree.getRandomUniqueIntArray(20);

        System.out.println(ColorANSI.PURPLE + "\n\nИсходный массив: \n" + ColorANSI.RESET + Arrays.toString(arr));

        int minMax = arr.length * -1;
        int maxMin = arr.length;

        int indexMinMax = 0;
        int indexMaxMin = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < maxMin) {
                maxMin = arr[i];
                indexMaxMin = i;
            }

            if (arr[i] < 0 && arr[i] > minMax) {
                minMax = arr[i];
                indexMinMax = i;
            }
        }

        arr[indexMaxMin] = minMax;
        arr[indexMinMax] = maxMin;

        System.out.println(ColorANSI.PURPLE + "\nИтоговый массив. Где максимальный отрицательный и " +
                "минимальный положительный элементы массива поменены местами: \n"
                + ColorANSI.RESET + Arrays.toString(arr) + "\n");
    }

    private static void completeSecondTask() {
        Product[] products = UtilsProduct.getRandomArrayProduct(10);
        double priceGift = 0;
        double weightGift = 0;

        System.out.println(ColorANSI.CYAN + "\n Сформированный подарок\n"
                + ColorANSI.RESET + Arrays.toString(products));

        for (Product product : products) {
            priceGift += product.getCoast();
            weightGift += product.getWeight();
        }

        System.out.println(ColorANSI.GREEN + "\nПодсчет\n" + ColorANSI.RESET +
                "Общий вес подарка: " + String.format("%.2f", weightGift) +
                " | Общая стоимость подарка: " + String.format("%.2f", priceGift) + "\n");
    }
}
