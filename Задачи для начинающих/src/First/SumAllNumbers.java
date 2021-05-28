package First;

import java.util.Scanner;

public class SumAllNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int n1 = n / 100;
        int n2 = n / 10 % 10;
        int n3 = n % 100 % 10;
        System.out.println(n1 + n2 + n3);
    }
}
