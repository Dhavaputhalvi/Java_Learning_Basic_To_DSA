import  java.util.*;

class Factorial {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numberto find factorial: ");
        int n=sc.nextInt();
        if(n==0 || n==1){
            System.out.println("Factorial of 0 and 1 is 1");
            return;
        }

        int fact=1;

        for(int i=2;i<=n;i++){
           fact=fact*i;
        }

        System.out.println("Factorial of"+n+" is "+fact);
    }
}