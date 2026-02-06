package loops;

// Print multiplication table of a number.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int num, times, tot;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        System.out.print("How many times you want: ");
        times = sc.nextInt();

        for(int i = 0; i <= times; i++){
            tot = num * i;
            System.out.printf("%d x %d = %d\n", num, i , tot);
        }
    }
}
