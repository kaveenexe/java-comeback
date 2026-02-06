package loops;

// Calculate factorial using a loop.

import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int tot = 1;

        for(int i = 1; i <= num; i++) {
            tot = tot * i;
            System.out.println(i);
        }
        System.out.println(tot);
    }
}
