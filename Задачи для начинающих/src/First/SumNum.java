//package First;

import java.util.Scanner;

/**
 * https://acmp.ru/index.asp?main=task&id_task=2
 */

public class SumNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
