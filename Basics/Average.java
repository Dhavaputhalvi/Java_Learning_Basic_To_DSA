import java.util.*;
class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number : ");
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        int result=(a+b+c)/3;
        
        System.out.println("The Average of 3 Numbers is : "+result);
    }
}