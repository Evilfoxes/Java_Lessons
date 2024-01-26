//Напишите метод, который сжимает строку.
//Пример: вход aaaabbbcdd.
//Результат: a4b3cd2

public class Task2 {
    public static void main(String[] args) {
        String s = "aaaabbbcdd";
        System.out.println(compress(s));
    }

    static String compress(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                stringBuilder.append(s.charAt(i));
            } else if (s.charAt(i) == s.charAt(i - 1)) {
                stringBuilder.append(s.charAt(i));
            } else {
                stringBuilder.append(s.charAt(i - 1));
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}