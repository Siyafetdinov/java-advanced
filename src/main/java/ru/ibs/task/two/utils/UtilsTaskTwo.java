package ru.ibs.task.two.utils;

import ru.ibs.utils.UtilsScanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilsTaskTwo {

    /**
     * Метод возвращает массив строк.
     * В случае если передавать значение sizeArray <= 0. Метод вернет пустой массив
     *
     * @param sizeArray размер массива.
     * @return массив строк
     */
    public static String[] getArrayWord(int sizeArray) {

        if (sizeArray <= 0) {
            return new String[0];
        }

        String[] array = new String[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Слово: [" + (i + 1) + "/" + sizeArray + "]");
            array[i] = UtilsScanner.getWordFromInput();
        }
        return array;
    }

    /**
     * Метод возвращает самые длинные значение из получаемого массива
     *
     * @param array массив строк
     * @return массив с самыми длинными значениями
     */
    public static String[] getAllLongWords(String[] array) {

        String tmp = "";
        List<String> result = new ArrayList<>();

        for (String str : array) {
            if (str.length() > tmp.length()) {
                tmp = str;
                result.clear();
                result.add(str);
            } else if (str.length() == tmp.length()) {
                result.add(str);
            }
        }

        return result.toArray(new String[0]);
    }
}
