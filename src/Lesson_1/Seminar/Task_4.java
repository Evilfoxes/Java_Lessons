public class Task4 {
    public static void main(String[] args)
    {
        String text = "Добро пожаловать на курс по Java";
        String[] arrText = text.split(" ");
        for (int i = arrText.length - 1; i > -1; i--) {
            System.out.print(arrText[i] + " ");
        }
    }
}