import java.util.*;
class ConsonantOrVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        
        char s = Character.toLowerCase(sc.next().charAt(0));
       
        if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u')
             System.out.println("You have entered a vowel ");
        else
            System.out.println("You have entered a consonant ");
    }
}