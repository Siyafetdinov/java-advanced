package ru.ibs.task.one;

import ru.ibs.constants.ColorANSI;
import ru.ibs.menu.MainMenu;
import ru.ibs.utils.UtilsMenu;
import ru.ibs.utils.UtilsScanner;

/**
 * Задание 1.
 * Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
 * Использовать комментарии и JavaDoc при описании метода.
 * Использовать форматирование при выводе результата в консоль.
 * Полученный результат округлять до 4-х знаков после запятой.
 * Запушить проект в свой репозиторий на GitHub и прикрепить ссылку на него в ответе на задание
 * Доп задание по желание: добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
 */
public class TaskOne {

    private static final String[] menuItem = {"Сложение", "Вычитание", "Деление", "Умножение", "Выйти в главное меню"};

    /**
     * Метод запускает меню Задания 1
     */
    public static void startTask() {
        menu();
    }

    /**
     * Метод отображает меню Задания 1 на экране. Получает значение из консоли и отправляет в обработчик
     */
    private static void menu() {
        UtilsMenu.displayMenu("Калькулятор двух дробных чисел. Выберите операцию:", menuItem);
        menuHandler(UtilsScanner.getIntFromInput());
    }

    /**
     * Обработчик главного меню
     *
     * @param valueMenu пункт который выбирает пользователь
     */
    private static void menuHandler(int valueMenu) {

        // Проверка на выход в основное меню
        if (valueMenu == menuItem.length) {
            MainMenu.startHandler();
            return;
        }

        System.out.println("\n\nВведите первое дробное значение.\n" + ColorANSI.PURPLE +
                "Примеры допустимого ввода: 2.0 | 2,0 | -2.0 | -2,0 | 2 | -2 |" + ColorANSI.RESET);
        double valueOne = UtilsScanner.getDoubleFromInput();

        System.out.println("Введите второе дробное значение.\n" + ColorANSI.PURPLE +
                "Примеры допустимого ввода: 2.0 | 2,0 | -2.0 | -2,0 | 2 | -2 |" + ColorANSI.RESET);
        double valueTwo = UtilsScanner.getDoubleFromInput();

        switch (valueMenu) {
            default: {
                UtilsMenu.menuNotElement();
                menu();
                break;
            }
            case 1: {
                System.out.printf("Результат задачи: %s + %s = %.4f\n", valueOne, valueTwo, valueOne + valueTwo);
                UtilsMenu.exitMenu();
                menu();
                break;
            }
            case 2: {
                System.out.printf("Результат задачи: %s - %s = %.4f\n", valueOne, valueTwo, valueOne - valueTwo);
                UtilsMenu.exitMenu();
                menu();
                break;
            }
            case 3: {
                if (valueTwo == 0) {
                    System.out.println(ColorANSI.RED + "Делить на ноль нельзя! " + ColorANSI.YELLOW +
                            "\nПовторите ввод значений" + ColorANSI.RESET);
                    UtilsMenu.exitMenu();
                    menuHandler(4);
                    break;
                }
                System.out.printf("Результат задачи: %s / %s = %.4f\n", valueOne, valueTwo, valueOne / valueTwo);
                UtilsMenu.exitMenu();
                menu();
                break;
            }
            case 4: {
                System.out.printf("Результат задачи: %s * %s = %.4f\n", valueOne, valueTwo, valueOne * valueTwo);
                UtilsMenu.exitMenu();
                menu();
                break;
            }
        }
    }
}