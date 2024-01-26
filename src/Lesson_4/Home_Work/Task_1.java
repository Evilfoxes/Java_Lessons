//Дан LinkedList с несколькими элементами разного типа.
// В методе revert класса LLTasks реализуйте разворот этого списка без использования
// встроенного функционала.
//
//Пример
//
//
//// Дан
//[1, One, 2, Two]
//
//// Вывод
//[1, One, 2, Two]
//[Two, 2, One, 1]

import java.util.LinkedList;
import java.util.List;

class LLTask {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        Object element;
        for (int i = ll.size() - 2 ; i >= 0; i--) {
            element = ll.get(i);
            ll.remove(i);
            ll.add(ll.size(), element);
        }
        return ll;
    }
}

public class Printer{
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.perseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.perseInt(args[2]));
            ll.add(args[3]);
        }

        LLTask answer = new LLTask();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
}