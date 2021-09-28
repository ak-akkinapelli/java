import java.util.Scanner;
public class NameAgeAndSalary {
    public static void main(String [] args)
    {
       try( Scanner keyboard = new Scanner(System.in))
       {
        String name;
        String age;
        String wage;
        System.out.println("Hello.  What is your name?");
        name = keyboard.next();
        System.out.println("Hi, "+name+" !  How old are you?");
        age = keyboard.next();
        System.out.println("So you're "+age+", eh?  That's not old at all!\nHow much do you make, "+name+"?");
        wage = keyboard.next();
        System.out.println(wage+"  I hope that's per hour and not per year! LOL!");
        
        


       }


    }
    
}
