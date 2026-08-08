import java.util.*;
class Alphabet_Or_Not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a character");
        char alphabet=sc.next().charAt(0);
        int alpha=(int)alphabet;
        
        if(alpha>=65 && alpha<=90)
            System.out.println("Capital Alphabet");
        else if(alpha>=97 && alpha<=122)
            System.out.println("Small Alphabet");
        else
            System.out.println("Not an Alphabet");
    }
}