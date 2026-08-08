import java.util.*;
import java.time.*;
class BitwiseOpertions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        boolean a=true;
        boolean b=false;
        System.out.println(a+"\n"+b);
        //Bitwise AND
        System.out.println("Bitwise AND Operation");
        if(a & b)
            System.out.println("True");
        else
            System.out.println("False");
            
            
        //Bitwise OR
        System.out.println("Bitwise OR Operation");
        if(a | b)
            System.out.println("True");
        else
            System.out.println("False");
            
        //Bitwise XOR
        System.out.println("Bitwise XOR Operation");
        if(a ^ b)
            System.out.println("False");
        else
            System.out.println("True");
        
    }
}