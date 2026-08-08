import java.util.*;
import java.time.*;
class LogicalOpertions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Number 1 : ");
        int a=sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int b=sc.nextInt();
        System.out.println("Enter Number 3 : ");
        int c=sc.nextInt();
        
        
        //Relational Operators
        if(a==b){
            System.out.println("A and B are equal");
        }
        if(a!=b)
            System.out.println("A and B are unique");
        
        System.out.println("Comparison between Number 1 and Number 2");
        if(a>b)
            System.out.println("Number 1 is big");
        else
            System.out.println("Number 2 is big");
            
        //Logical Operators
        System.out.println("Comparison between three Numbers");
        if(a>b && a>c)
            System.out.println("Number 1 is big");
        else if(b>a && b>c)
            System.out.println("Number 2 is big");
        else
            System.out.println("Number 3 is big");
            
        //Ternary Operator
        String result=((a>=b && a>=c) ? "A is big" : "B is big");
         System.out.println(result);
        
    }
}