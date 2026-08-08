import java.util.*;
import java.time.*;
class UnaryOpertions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        int i=0;
        int arr[]=new int[n];
        while(i<n){
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.println("Reversed Array\n");
        int j=n-1;
        while(j>=0){
            System.out.println(arr[j]);
            j--;
        }
    }
}