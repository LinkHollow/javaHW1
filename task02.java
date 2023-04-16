// n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task02 {

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int x = iScanner.nextInt();
        System.out.println(getFactorial(x));
        iScanner.close();
    }
}