import java.util.*;
class Greeting {
    public static void greet(String name){
        System.out.println("Good Morning, "+name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=sc.nextLine();
        greet(name);
    }
}