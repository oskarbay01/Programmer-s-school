package FirstTasks;

import java.util.Scanner;

/* Askar created on 13.05.2021 inside the package - FirstTasks */
public class MoreLess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println("<");
        } else if (a > b) {
            System.out.println(">");
        } else {
            System.out.println("=");
        }
    }
}
