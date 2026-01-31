package basics;

// Add two integers and print the result.

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String [] args) {
        int A = 5;
        int B = 10;
        int C = A + B;
        System.out.println("=== 1st Method ==============");
        System.out.println("Sum is: "+ C);
        System.out.println("=============================");

        System.out.println("=== 2st Method ==============");
        Scanner userinput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = userinput.nextInt();
        System.out.print("Enter second number: ");
        int y = userinput.nextInt();

        int z = x + y;

        System.out.println("Sum is " + z);
    }
}
