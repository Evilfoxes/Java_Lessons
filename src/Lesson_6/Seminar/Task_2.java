import java.util.HashSet;
import java.util.Set;

public class Task_2 {
    public static void main(String[] args) {
        Set<Cat> = new HashSet<>();

        Cat cat1 = new Cat();
        cat1.setName("Кузя");
        cat1.setAge(10);
        cat1.setPoroda("Дворняга");
        cat1.setOwner("Васильев Иван");

        Cat cat2 = new Cat();
        cat2.setName("Джери");
        cat2.setAge(6);
        cat2.setPoroda("Мейкун");
        cat2.setOwner("Смоляков Дмитрий");

        Cat cat3 = new Cat();
        cat3.setName("Муся");
        cat3.setAge(15);
        cat3.setPoroda("Дворняга");
        cat3.setOwner("Сахарова Наталья");

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        printSet(cats);
        System.out.println();
        printSet(findByAge(cats, 3));
    }
    public static void printSet(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
    public static Set<Cat> findByAge(Set<Cat> cats, int minAge) {
        Set<Cat> result = new HashSet<>();
        for (Cat cat : cats) {
            if (cat.getAge() >= minAge) {
                result.add(cat);
            }
        }
        return result;
    }
}