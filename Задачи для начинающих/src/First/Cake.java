//package First;

import java.util.Scanner;

/**
 * https://acmp.ru/index.asp?main=task&id_task=539
 */

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n==1) {
            System.out.println("0");
        }else if(n%2==0){
            System.out.println(n/2);
        }else
            System.out.println(n);

    }
}
