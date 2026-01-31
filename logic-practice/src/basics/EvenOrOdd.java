package basics;

// Check if a number is even or odd.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("The entered number is an EVEN Number");
        } else {
            System.out.println("The entered number is an ODD Number");
        }
    }
}
