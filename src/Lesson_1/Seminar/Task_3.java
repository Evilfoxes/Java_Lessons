import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 3};
        int val = 3;
        System.out.println(Arrays.toString(sort(arr, val)));

    }static int[] sort(int[] arr, int number){
        int[] sortArr = new int[arr.length];
        int countVal = arr.length - 1;
        int countNum = 0;
        for (int i = 0; i < sortArr.length; i++) {
            if (arr[i] == number) {
                sortArr[countVal] = arr[i];
                countVal--;
            }else {
                sortArr[countNum] = arr[i];
                countNum++;
            }
        }return sortArr;
    }
}
