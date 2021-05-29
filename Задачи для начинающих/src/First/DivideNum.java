package First;

import java.util.Scanner;

public class DivideNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("1");
        } else {
            System.out.println("666");
        }
    }
}
