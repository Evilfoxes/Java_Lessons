//Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
//
//Напишите свой код в методе printPrimeNums класса Answer.
//
//Пример
//
//2
//3
//5
//7
//11
//...

class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        int num = 59;
        System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53);


        while (num <= 997) {
            if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % 11 == 0 || num % 13 == 0 || num % 17 == 0 || num % 19 == 0 || num % 23 == 0 || num % 29 == 0 || num % 31 == 0 || num % 37 == 0 || num % 41 == 0 || num % 43 == 0 || num % 47 == 0 || num % 53 == 0) {
                num++;
            } else {
                System.out.println(num);
                num++;
            }
        }


    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}