public class Task_6 {
    private int[] arr = new int[10];
    private int size = 0;

    int size() {
        return size;
    }
    boolean empty() {
        return size == 0;
    }
    void push(int item) {
        if (size >= arr.length) {
            int[] arr2 = new int[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = item;
        }
        int peek() {
        return arr[size - 1];
    }
    int pop() {
        return arr[--size];

    @Override
            public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.appened("[");
        if (!empty()){
            stringBuilder.append(arr[size - 1]);
        }
        for (int i = size - 2; i >= 0; i--) {
            stringBuilder.append(", ");
            stringBuilder.append(arr[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
        }
    }
}