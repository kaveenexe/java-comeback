package basics;

// Calculate simple interest

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your interest: ");
        float interest = sc.nextFloat();

        System.out.print("Enter your Deposited amount: ");
        float amt = sc.nextFloat();

        System.out.print("How long was the money deposited for?: ");
        int time = sc.nextInt();

        float calcInterest = amt * interest / 100;
        float totInterest = calcInterest * time;
        float totAmt = amt + totInterest;

        System.out.printf("You will get %f as your interest each year\n", calcInterest);

        System.out.printf("Your total interest for %d year(s) is %.2f and your will have total %.2f.", time, totInterest, totAmt);
    }
}
