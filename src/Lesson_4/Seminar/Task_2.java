import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Task_2 {
    public static void main(String[] args) {
        List<string> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            String line = scanner.nextLine();
            String[] parts = line.split("~");
            String text = parts[0];
            int num = Integer.perseInt(parts[1]);
            switch (text){
                case "print":
                    if (num >= 0 && num < list.size()) {
                        System.out.println(list.remove(num));
                    }
                    break;
                    case "finish":
                        work = false;
                        break;
                default:
                    if (num >= && num <= list.size()){
                        list.add(num, text);
                    }
            }
        }
    }
}