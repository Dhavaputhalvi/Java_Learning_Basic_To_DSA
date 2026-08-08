import java.util.*;
class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int a=sc.nextInt();
        System.out.println("Enter Number 2: ");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}