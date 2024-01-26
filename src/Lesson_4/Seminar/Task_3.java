import java.util.LikedList;
import java.util.Scanner;
import java.util.List;
import java.util.ListIterator;

public class Task_3 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            String text = scanner.nextLine();
            switch (text){
                case "print":
                    for (String item: list) {
                        System.out.println(item);
                    }
                    break;
                    case "stop":
                        flag = false;
                        break;
                        case "revert":
                            list.remove(0);
                            break;
                default:
                    list.add(0, text);
                    }
            }
        }
    }
}