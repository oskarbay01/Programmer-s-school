package First;

import java.util.Scanner;

/**
 *
 */

public class FiveFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long res = (long) Math.pow(a, 2);
        System.out.println(res);
    }
}
