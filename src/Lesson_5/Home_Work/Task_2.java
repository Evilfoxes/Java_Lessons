//Вы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу, которая принимает на вход пять имен пользователей (или использует имена по умолчанию, если аргументы не предоставлены) и подсчитывает, сколько раз каждое имя встречается.
//Программа должна использовать HashMap для хранения имен и их количества вхождений.
//        По завершении, программа выводит результат в виде пар "имя - количество".
//
//На входе:
//
//
//        'Elena'
//        'Elena'
//        'Elena'
//        'Ivan'
//        'Ivan'
//На выходе:
//
//
//        {Ivan=2, Elena=3}

import java.util.HashMap;
public class Printer {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;

        if (args.length == 0) {
            name1 = "Elena";
            name2 = "Elena";
            name3 = "Elena";
            name4 = "Ivan";
            name5 = "Ivan";
        } else {
            name1 = args[0];
            name2 = args[1];
            name3 = args[2];
            name4 = args[3];
            name5 = args[4];
        }
        NamesCounter namesCounter = new NamesCounter();

        namesCounter.add(name1);
        namesCounter.add(name2);
        namesCounter.add(name3);
        namesCounter.add(name4);
        namesCounter.add(name5);
        namesCounter.showNamesOccurrences();

    }
}

class NamesCounter {
    private HashMap<String, Integer> namesOccurrences = new HashMap<>();
    public void add(String name) {
        int countName = 1;
        if (names.containsKey(name)) {
            names.put(name, names.get(name) + 1);
        } else {
            names.put(name, countName);
        }
    }
    public void showNamesOccurrences() {
        for (Map.Entry<String, Integer> entry : namesOccurrences.entrySet()) {
            System.out.println(names);
        }
    }
}