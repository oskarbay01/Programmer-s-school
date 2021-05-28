package First;

import java.util.Scanner;

/* Askar created on 28.05.2021 inside the package - First */
public class LastNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = n%100%10;
        System.out.println(res);
    }
}
