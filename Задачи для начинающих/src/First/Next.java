package First;

import java.util.Scanner;

/* Askar created on 28.05.2021 inside the package - First */
public class Next {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("The next number for the number "+n+" is "+(n+1)+".");
        System.out.println("The previous number for the number "+(n--)+" is "+(n--)+".");

    }
}
