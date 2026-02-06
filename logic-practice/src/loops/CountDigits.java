package loops;

// Count number of digits in a number.

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to count digits: ");
        int num = sc.nextInt();

        int count = 0;

        if (num == 0){
            count = 1;
        } else {
            for(; num != 0; num = num / 10){
                System.out.println("started" + num);
                count++;
            }
        }
        System.out.printf("Entered number has %d digits", count);
    }
}
