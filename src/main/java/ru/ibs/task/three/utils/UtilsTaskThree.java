package ru.ibs.task.three.utils;

import java.util.*;

public class UtilsTaskThree {

    /**
     * Метод возвращает перемешанный массив с заданным размером и случайными значениями внутри
     *
     * @param size размер массива
     * @return случайный массив
     */
    public static int[] getRandomUniqueIntArray(int size) {

        if (size <= 1) {
            return new int[0];
        }

        List<Integer> list = new ArrayList<>();
        int[] result = new int[size];

        for (int i = (size / 2 * -1); i <= (size - (size / 2)); i++) {
            if (i == 0) {
                continue;
            }
            list.add(i);
        }

        Collections.shuffle(list);

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
