//Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
//Напишите метод для заполнения данной структуры.
//
//[
//["Сказка", "Золотой ключик", "Репка"],
//["Роман", "Мастер и Маргарита", "Война и Мир"],
//["Фентези", "Гарри Поттер", "Ночной дозор"]
//]

import java.util.ArrayList;
import java.util.List;

public class Task_3 {
    public static void main(String[] args)
        {
            List<List<String>> shopBook = new ArrayList<>();
            addBook(shopBook, "Сказка", "Золтой ключик");
            addBook(shopBook, "Роман", "Мастер и Маргарита");
            addBook(shopBook, "Фентези", "Гарри Поттер");
            addBook(shopBook, "Роман", "Война и Мир");
            addBook(shopBook, "Фентези", "Ночной дозор");

            System.out.println(shopBook);
        }

        private static void addBook(List<List<String>> shopBook, String genre, String nameBook)
        {
            for (int i = 0; i < shopBook.size(); i++){
                list<String> bookshelf = shopBook.get(i);
                if (bookshelf.get(0)equalsIgnoreCase(genre)){
                    bookshelf.add(nameBook);
                    return;
                }
            }
            List<String> bookshelf = new ArrayList<>();
            bookshelf.add(genre);
            bookshelf.add(nameBook);
            shopBook.add(bookshelf);
        }

}