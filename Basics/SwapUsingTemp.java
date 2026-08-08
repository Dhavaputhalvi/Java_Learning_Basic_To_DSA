import java.util.*;
class SwapUsingTemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int a=sc.nextInt();
        System.out.println("Enter Number 2: ");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}