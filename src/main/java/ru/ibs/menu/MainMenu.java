package ru.ibs.menu;

import ru.ibs.task.one.TaskOne;
import ru.ibs.task.five.TaskFive;
import ru.ibs.task.four.TaskFour;
import ru.ibs.task.six.TaskSix;
import ru.ibs.task.three.TaskThree;
import ru.ibs.task.two.TaskTwo;
import ru.ibs.utils.UtilsMenu;
import ru.ibs.utils.UtilsScanner;

/**
 * Главное меню, которое отображается при запуске программы
 */
public class MainMenu {
    private static String[] menuItem = {
            "Задание №1 Калькулятор",
            "Задание №2 Операции калькулятора",
            "Задание №3 Массивы",
            "Задание №4 ООП",
            "Задание №5 Коллекции",
            "Задание №6 Обработка исключений"
    };

    /**
     * Метод запускающий меню.
     */
    public static void startHandler() {
        mainMenu();
    }

    /**
     * Метод отображает главное меню на экране. Получает значение из консоли и отправляет в обработчик
     */
    private static void mainMenu() {
        UtilsMenu.displayMenu("Выберите задание для проверки: ", menuItem);
        mainMenuHandler(UtilsScanner.getIntFromInput());
    }

    /**
     * Обработчик главного меню
     *
     * @param valueItem пункт который выбирает пользователь
     */
    private static void mainMenuHandler(int valueItem) {
        switch (valueItem) {
            case 1: {
                TaskOne.startTask();
                break;
            }
            case 2: {
                TaskTwo.startTask();
                break;
            }
            case 3: {
                TaskThree.startTask();
                break;
            }
            case 4: {
                TaskFour.startTask();
                break;
            }
            case 5: {
                TaskFive.startTask();
                break;
            }
            case 6: {
                TaskSix.startTask();
                break;
            }
            default: {
                UtilsMenu.menuNotElement();
                mainMenu();
            }
        }
    }
}
