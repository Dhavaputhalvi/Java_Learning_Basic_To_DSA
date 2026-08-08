import java.util.*;
class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a=sc.nextInt();
        if(a>0)
            System.out.println(a+" is Positive");
        else if(a<0)
            System.out.println(a+" is Negative");
        else
            System.out.println(a+" is Zero");
    }
}