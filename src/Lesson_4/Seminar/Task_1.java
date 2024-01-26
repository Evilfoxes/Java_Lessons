import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        List<integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        testTime(list1);
        testTime(list2);
        System.out.println("ArrayList: " + testTimeForRead(list1));
        System.out.println("LinkedList: " + testTimeForRead(list2));
    }
    static long testTime(List<integer> list){
        long timeStart  = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }
    static long testTimeForRead(List<integer> list){
        long sum = 0;
        long timeStart  = System.currentTimeMillis();
        for (int a: list) {
            sum += a;
        }
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }
}