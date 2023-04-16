// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n)
import java.util.Scanner;

public class task01 {
    public static String showTotalAmount(int value) {
        return (value * (value + 1) / 2) + "";
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int x = iScanner.nextInt();

        System.out.println(showTotalAmount(x));
        iScanner.close();
    }
}
