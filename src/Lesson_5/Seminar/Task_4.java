//Написать программу, определяющую правильность расстановки скобок в выражении.
//        Пример 1: a+(d*3) - истина
//Пример 2: [a+(1*3) - ложь
//Пример 2: [a+(1]*3) - ложь
//Пример 3: [6+(3*3)] - истина
//Пример 4: {a}[+]{(d*3)} - истина
//Пример 5: <{a}+{(d*3)}> - истина
//Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println(isValid("a+(d*3)"));
        System.out.println(isValid("[a+(1*3) - ложь"));
        System.out.println(isValid("[a+(1)*3] - ложь"));
        System.out.println(isValid("[6+(3*3)]"));
        System.out.println(isValid("{a}[+]{(d*3)}"));
        System.out.println(isValid("<{a}+{(d*3)}>"));
        System.out.println(isValid("{a+]}{(d*3)}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            }
            if (map.constainValue(c)) {
                if (stack.empty() || map.get(stack.pop() != c)  {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}