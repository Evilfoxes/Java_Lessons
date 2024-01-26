//Создать структуру для хранения Номеров паспортов
//и Фамилий сотрудников организации.
//        123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//Вывести данные по сотрудникам с фамилией Иванов.

public class Task_2 {
    public static void main(String[] args) {
        Passport passport = new Passport();
        passport.addPassport("123456", "Иванов");
        passport.addPassport("321456", "Васильев");
        passport.addPassport("234561", "Петрова");
        passport.addPassport("234432", "Иванов");
        passport.addPassport("654321", "Петрова");
        passport.addPassport("345678", "Иванов");
        System.out.println(passport.search("Иванов"));
        System.out.println(idName);
    }
}