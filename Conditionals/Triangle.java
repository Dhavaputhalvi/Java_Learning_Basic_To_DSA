import java.util.*;
class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the angles of a triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        if(a+b+c != 180){
            System.out.println("A triangle has only 180 degree");
            return;
        }
        
        if(a==90 || b==90 || c==90)
            System.out.println("A right angle triangle");
        else if(a==b && a==c)
             System.out.println("A Equalateral angle triangle ");
        else if(a>90 || b>90 || c>90)
             System.out.println("A Obtuse angle triangle");
        else if(a<60 || b<60 || c<60)
             System.out.println("A Acute angle triangle ");
        else if(a==b || b==c)
            System.out.println("A Isoceles angle triangle ");
    }
}