import java.util.*;
import java.time.*;
class DateTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        LocalDate d=LocalDate.now();
        LocalTime t=LocalTime.now();
        
        System.out.println("Date : "+d);
        System.out.println("Time : "+t);
    }
}