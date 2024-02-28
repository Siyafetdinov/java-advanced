package ru.ibs.task.five.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class UtilsTaskFive {

    public static List<String> getTextFromFile(String pathFile) {
        List<String> result = new ArrayList<>();
        File file = Path.of(pathFile).toFile();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.addAll(Arrays.asList(line.split(" ")));
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getStringCountsWord(HashMap<String, Integer> hashMap) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            result.append("Слово: ")
                    .append(entry.getKey())
                    .append(" встречается: ")
                    .append(entry.getValue())
                    .append(" раз(а)\n");
        }
        return result.toString();
    }

    public static HashMap<String, Integer> getSortHashMap(List<String> list) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String str : list) {
            if (result.containsKey(str)) {
                result.replace(str, result.get(str) + 1);
            } else {
                result.put(str, 1);
            }
        }
        return result;
    }

    public static HashMap<String, Integer> getWordsMaximumRepetition(List<String> list) {
        HashMap<String, Integer> result = new HashMap<>();
        int min = 0;

        for (Map.Entry<String, Integer> entry : getSortHashMap(list).entrySet()) {
            if (entry.getValue() == min) {
                result.put(entry.getKey(), entry.getValue());
            } else if (entry.getValue() > min) {
                min = entry.getValue();
                result.clear();
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}
