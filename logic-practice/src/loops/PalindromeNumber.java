package loops;

// Check if a number is palindrome.

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;
        int enteredNum = num;

        while ( num != 0 ) {
            int digits = num % 10;
            reversed = reversed * 10 + digits;
            num = num / 10;
        }

        if (enteredNum == reversed) {
            System.out.print("Number is a palindrome");
        } else {
            System.out.print("Number is not a palindrome");
        }
    }
}
