//package First;

import java.util.Scanner;

/**
 * https://acmp.ru/index.asp?main=task&id_task=754
 */

public class ThreeFatMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a<94 || a>727) || (b<94 || b>727) || (c<94 || c>727))
            System.out.println("Error");
        else
            System.out.println(Math.max(Math.max(a,b),c));
        }
    }
