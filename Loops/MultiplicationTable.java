import java.util.*;

public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print Multiplication Table");
        int n=sc.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(i+" * "+n+" = "+(i*n));
        }

        

    }
}