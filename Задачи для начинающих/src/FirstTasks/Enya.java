package FirstTasks;

import java.util.Scanner;

public class Enya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = a*b*c*2;
        System.out.println(result);
    }
}
