import java.util.*;
import java.time.*;
class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Number 1 : ");
        int a=sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int b=sc.nextInt();
        
        System.out.println("Performing Addition \n Sum of Two numbers is : "+(a+b));
         System.out.println("-------------------------");
         System.out.println("Performing Subtraction \n Difference of Two numbers is : "+(a-b));
         System.out.println("-------------------------");
         System.out.println("Performing Multiplication \n Product of Two numbers is : "+(a*b));
         System.out.println("-------------------------");
         System.out.println("Performing Division \n Quotient of Two numbers is : "+(a/b));
         System.out.println("-------------------------");
         System.out.println("Performing Modulus \n Remainder of Two numbers is : "+(a%b));
    }
}