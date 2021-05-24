//package First;

import java.util.Scanner;

/**
 * https://acmp.ru/index.asp?main=task&id_task=21
 */
public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max=Math.max(Math.max(a,b),c);
        int min=Math.min(Math.min(a,b),c);
        System.out.println(max-min);
    }
}
