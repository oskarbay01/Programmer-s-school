//package First;

import java.util.Scanner;

/* Askar created on 29.05.2021 inside the package - First */
public class DivideApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((b / a) + " " + (b % a) + " " + (a - b % a) % a);
    }
}
