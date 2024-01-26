import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();
        System.out.println(pow(a, b));
    }
    public static double pow(double a, int b){
        if (b == 0 || a == 1) {
            return 1;
        }
        double res = 1;
        if (b < 0) {
            b = -b;
            a = 1.0 / a;
        }
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
    }
}