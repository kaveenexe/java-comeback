package loops;

// Calculate sum of first n natural numbers.

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main (String[] args) {

        int n = 0;
        int x = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Up to what number should I add: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            x = x + i;
        }
        System.out.print("Sum is: " + x);
    }
}
