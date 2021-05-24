//package First;

import java.util.Scanner;

/* Askar created on 24.05.2021 inside the package - First */
public class Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int b3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        int b4 = scanner.nextInt();

        int a = a1 + a2 + a4 + a3;
        int b = b1 + b2 + b4 + b3;

        if (a > b) {
            System.out.println("1");
        } else if (a < b) {
            System.out.println("2");
        } else
            System.out.println("DRAW");
    }
}
