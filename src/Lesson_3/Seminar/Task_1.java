//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.

import java.util.*;
public class Task_1 {
    public static void main(String[] args) {
        int n = 10;
        Random random = new Random();
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(1,10));
        }
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}