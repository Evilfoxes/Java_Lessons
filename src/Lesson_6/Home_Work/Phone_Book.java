//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что в во входной структуре будут
//повторяющиеся имена с разными телефонами, их необходимо считать,
//как одного человека с разными телефонами. Вывод должен быть отсортирован
//по убыванию числа телефонов.


import java.util.HashMap;


public class Phone_Book {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Ivan", "+359888888888");
        phoneBook.put("Peter", "+359999999999");
        phoneBook.put("George", "+359777777777");
        phoneBook.put("John", "+359666666666");
        System.out.println(phoneBook);
        System.out.println();
        System.out.println(phoneBook.get("Ivan"));
        System.out.println();
        System.out.println(phoneBook.get("George"));
    }
    //Метод доавления нового телефонного номера
    public static void add(HashMap<String, String> phoneBook, String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, phone);
        } else {
            phoneBook.replace(name, phone);
        }
    }
    //Метод удаления телефонного номера
    public static void remove(HashMap<String, String> phoneBook, String name) {
        phoneBook.remove(name);
    }
    //Метод поиска телефонного номера
    public static String find(HashMap<String, String> phoneBook, String name) {
        return phoneBook.get(name);
    }
    //Метод отсортировки телефонных номеров
    public static void sort(HashMap<String, String> phoneBook) {
        Set<String> names = phoneBook.keySet();
        for (String name : names) {
            String phone = phoneBook.get(name);
            System.out.println(name + " - " + phone);
        }
    }

}