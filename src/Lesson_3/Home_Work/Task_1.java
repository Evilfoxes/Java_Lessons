//Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
//
//Пример
//
//
//a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]


import java.util.Arrays;

class MegaSort {
    public static int[] mergeSort(int[] a) {
        if (a == null) {
            return null;
        }
        if (a.length <= 2) {
            return a;
        }
        int [] b = new int[a/ a.length/2];
        System.arraycopy(a, 0, b, 0 a.length/2);
        int [] c = new int[a.length - a.length/2];
        System.arraycopy(a, a.length/2, c, 0, a.length - a.length/2);
        b = mergeSort(b);
        c = mergeSort(c);
        int intArrB = 0;
        int intArrC = 0;
        for (int i = 0; i < a.length; i++) {
            if (b.length == intArrB) {
                a[i] = c[i - intArrB];
                intArrC++;
            } else if(c.length == intArrC){
                a[i] = b[i - intArrC];
                intArrB++;
            } else if ((b[intArrB] < c[intArrC])) {
                a[i] = b[intArrB];
                intArrB++;
            } else {
                a[i] = c[intArrC];
                intArrC++;
            }
        }
        return a;
    }
}

public class Printer{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            a = new int[] {5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(","))mapToInt(Integer::parseInt).toArray();
        }
        MegaSort answer = new MegaSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}