//package First;

import java.util.Scanner;

/**
 * https://acmp.ru/index.asp?main=task&id_task=8
 */

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        if (a*b==c){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
