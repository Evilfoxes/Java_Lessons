import java.time.LocalTime;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 7 && hour < 12){
//            System.out.println("Доброе утро, " + name + "!");
            System.out.printf("Доброе утро, %s!", name);
        }else if (hour >= 12 && hour < 18){
            System.out.println("Добрый день, " + name + "!");
        }else if (hour >= 18 && hour < 23){
            System.out.println("Добрый вечер, " + name + "!");
        }else {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}