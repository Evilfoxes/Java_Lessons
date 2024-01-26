//1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами
//от 0 до 24.
//2. Создайте метод, в который передайте заполненный выше массив и с помощью
//Set вычислите процент уникальных значений в данном массиве и верните его в виде числа
//с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в
//массиве.

public class Task_1 {
    public static void main(String[] args) {
        int[] arrSome = generateRandom(0, 24, 1000);
        System.out.println(Arrays.toString(arrSome));
        System.out.println(uniqueness(arrSome));
    }
    public static int[] generateRandom(int min, int max, int size) {
        Random rnd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rnd.nextInt(max - min);
        }
        return arr;
    }
    public static double uniqueness(int[] arr) {
        set<int[]> set = new HashSet<>(Arrays.asList(arr));
        return set.size() * 100.0 / arr.length;
    }
}
