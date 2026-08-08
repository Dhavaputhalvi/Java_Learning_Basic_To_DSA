import java.util.*;

class Fibonacci {

    static int fibo(int n){
        if(n==1)
            return 1;
        else if(n==0)
            return 0;
        
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number of terms to find Fibonacci series : ");
        int n=sc.nextInt();

        System.out.println("Fibonacci series");
        for(int i=0;i<n;i++)
            System.out.print(fibo(i)+" ");
    }
}