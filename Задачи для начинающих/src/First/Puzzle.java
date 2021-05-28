package First;

import java.util.Scanner;

/* Askar created on 28.05.2021 inside the package - First */
public class Puzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();

        int result=n*n-3*(n-1)-1;
        System.out.println(result);
    }
}
