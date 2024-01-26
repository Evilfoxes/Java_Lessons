//Создать список типа ArrayList
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Task_2 {
    public static void main(String[] args)
    {
        List<Object> arr = new ArrayList<>();

        arr.add("fgdg");
        arr.add(6);
        arr.add(7);
        arr.add(9,8);
        arr.add("fgdgfgfgd");
        arr.add("fgdg565");

        System.out.println(arr);
        Iterator<Object> Iterator = arr.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            if (object instanceof Integer){
                iterator.remove();
            }
        }
        System.out.println(arr);
    }
}
