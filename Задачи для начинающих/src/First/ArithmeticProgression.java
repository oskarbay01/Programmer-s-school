package First;

import java.util.Scanner;

/**
 * https://acmp.ru/?main=task&id_task=312
 */
public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int n = scanner.nextInt();
        int d = a2 - a1;
        System.out.println(a1 + (n - 1) * d);
    }
}
