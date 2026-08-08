import java.util.*;
class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of a rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter Breadth of a rectangle: ");
        int b=sc.nextInt();
        
        System.out.println("The area of a rectangle is :"+(l*b));
    }
}