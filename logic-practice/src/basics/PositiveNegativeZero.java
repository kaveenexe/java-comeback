package basics;

//Check whether a number is positive, negative, or zero.

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.print("Entered number is a positive number");
        } else if ( a < 0) {
            System.out.print("Entered number is a negative number");
        } else {
            System.out.print("You entered 0");
        }
    }
}
