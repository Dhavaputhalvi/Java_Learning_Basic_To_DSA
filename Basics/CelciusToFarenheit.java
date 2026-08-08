import java.util.*;
class CelciusToFarenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter celcius in degrees : ");
        float cel=sc.nextFloat();
        float faren=(cel-32)*5/9;
        System.out.println("Farenheit in degrees : "+faren);
    }
}