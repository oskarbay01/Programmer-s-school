package First;

import java.util.Scanner;

/**
 * https://acmp.ru/asp/do/index.asp?main=task&id_course=1&id_section=1&id_topic=27&id_problem=151
 */

public class Sling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = (n + 9) / 10;          //(n + 10 - 1) / 10;
        System.out.println(res);
    }
}
