//package First;

import java.util.Scanner;

/**
 * https://acmp.ru/index.asp?main=task&id_task=755
 */
public class Picking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = a + b - c;
        if (result < 0) {
            System.out.println("Impossible");
        }else
            System.out.println(result);
    }
}
