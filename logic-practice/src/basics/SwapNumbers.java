package basics;

//Swap two numbers
//first using a temp variable, then without temp.

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("==== Using a temp variable ====");
        int a = 10;
        int b = 20;

        System.out.println("Before Swap numbers");
        System.out.println("A is " + a);
        System.out.println("B is " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println();
        System.out.println("Swapped numbers");
        System.out.println("A is " + a);
        System.out.println("B is " + b);

        System.out.println("==== Without Using a temp variable ====");

        int x = 15;
        int y = 100;

        System.out.println("Before Swap numbers");
        System.out.println("X is " + x);
        System.out.println("Y is " + y);

        x = x + y; // 115
        y = x - y; // 15
        x = x - y; // 100

        System.out.println();
        System.out.println("Swapped numbers");
        System.out.println("X is " + x);
        System.out.println("Y is " + y);

    }
}
