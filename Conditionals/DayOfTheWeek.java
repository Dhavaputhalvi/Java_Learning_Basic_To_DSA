import java.util.*;
class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number from 1 to 7");
        int a=sc.nextInt();
        
       if(a<1 || a>7){
           System.out.println("A week only has 7 days");
           return;
       }
       
       switch(a){
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
            case 6:
               System.out.println("Saturday");
               break;
            case 7:
               System.out.println("Sunday");
               break;
       }
    }
}