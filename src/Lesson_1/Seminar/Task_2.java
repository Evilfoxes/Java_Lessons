public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int MaxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > MaxCount) {
                    MaxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(MaxCount);
    }
}
