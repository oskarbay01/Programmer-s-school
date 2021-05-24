package First;

import java.util.Scanner;

/* Askar created on 13.05.2021 inside the package - FirstTasks */
public class Nuts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a*b==20){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
