import java.util.*;

class EvenOdd_Using_Bitwise_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if ((n & 1) == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");

        sc.close();
    }
}