//Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива. Необходимо удалить из списка четные числа и вернуть результирующий.
//
//Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
//
//Примеры.
//Исходный массив:
//
//1, 2, 3, 4, 5, 6, 7, 8, 9
//Результат:
//
//[1, 3, 5, 7, 9]
//Исходный массив:
//
//2, 4, 6, 8
//Результат:
//
//[]

import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
                result.add(arr[i]);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
    }
        return result;
    }
}

public class Printer{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            arr = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
            } else {
                arr = Arrays.stream(args[0].split(","))map(Integer::parseInt).toArray(Integer[] :: new);

        }

        Answer answer = new Answer();
        System.out.println(ans.removeEvenNumbers(arr));
    }
}