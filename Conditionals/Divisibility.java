import java.util.*;
class Divisibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int a=sc.nextInt();
        
        if(a%3==0 && a%5==0)
            System.out.println("Divisible by 3 and 5");
        else if(a%3==0)
            System.out.println("Divisible by 3");
        else if(a%5==0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not Divisible by 3 or 5");
    }
}