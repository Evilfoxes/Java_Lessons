//Напишите программу, представляющую телефонную книгу.
// Программа должна иметь следующие функции:
//
//add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
//Если запись с именем name уже существует, добавляет новый номер телефона в
//существующую запись.
//Если запись с именем name не существует, создает новую запись с этим именем и номером
//телефона phoneNum.
//
//find(String name): Поиск номеров телефона по имени в телефонной книге.
//Если запись с именем name существует, возвращает список номеров телефона для этой записи.
//Если запись с именем name не существует, возвращает пустой список.
//
//getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена,
//а значения - списки номеров телефона.
//
//Пример.
//
//На входе:
//
//add("Alice", 123456);
//add("Alice", 789012);
//add("Bob", 789012);
//На выходе:
//
//Команды:
//
//find("Alice")
//getPhoneBook()
//find("Me")
//Результат:
//
//[123456, 789012].
//{Bob=[789012], Alice=[123456, 789012]}
//[]

import java.util.ArrayList;
import java.util.HashMap;

public class Printer {
    public static void main(String[] args) {
        String name1;
        String name2;
        Integer phone1;
        Integer phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 789012;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(myPhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));

    }
}

class PhoneBook {
    private HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> arrNumPhone = new ArrayList<>();
            arrNumPhone.add(phoneNum);
            phoneBook.put(name, arrNumPhone);
        }
    }
    public ArrayList<Integer> find(String name) {
        if (phoneBook.conteinsKey(name)) {
            return phoneBook.get(name);
            } else {
                ArrayList<Integer> arrayNull = new ArrayList<>();
                return arrayNull;
        }
    }
    public HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}