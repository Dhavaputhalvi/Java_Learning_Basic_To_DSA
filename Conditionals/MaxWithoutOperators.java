import java.util.Scanner;

public class MaxWithoutOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Formula to find maximum without using comparison operators
        int max = (a + b + Math.abs(a - b)) / 2;

        System.out.println("Maximum number is: " + max);

        sc.close();
    }
}