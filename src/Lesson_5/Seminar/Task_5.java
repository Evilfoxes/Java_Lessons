//Взять набор строк, например,
//
//Мороз и солнце день чудесный
//Еще ты дремлешь друг прелестный
//Пора красавица проснись.
//
//Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
//Слова с одинаковой длиной не должны “потеряться”.

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Task_5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Мороз и солнце день чудесный");
        list.add("Еще ты дремлешь друг прелестный");
        list.add("Пора красавица проснись.");
        System.out.println(sort(list));
    }
    public static List<String> sort(List<String> list) {
        TreeMap<Integer, List<String>> map = new TreeMap<>();
        for (String s : list) {
            int length = s.length();
            if (map.containsKey(length)) {
                map.get(length).add(s);
            } else {
                map.put(length, new ArrayList<>());
                map.get(length).add(s);
            }
        }
        List<String> result = new ArrayList<>();
        for (List<String> strings : map.values()) {
            result.addAll(strings);
        }
        return result;
    }
}