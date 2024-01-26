//Напишите метод, который принимает на вход строку (String)
//и определяет является ли строка палиндромом
//(возвращает boolean значение).

public class Polindrom {
    public static void main(String[] args)
    {
        System.out.println(polindromV2("А роза упала на лапу Азора"));
    }
    static boolean polindromV2(String str)
    {
        str = str.toLowerCase();
        str = str.replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(str);
    }

}