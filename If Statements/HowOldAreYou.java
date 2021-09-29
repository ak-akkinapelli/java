import java.util.Scanner;
public class HowOldAreYou {
    public static void main(String [] args)
    {
        try(Scanner  keyboard =new Scanner(System.in))
        {
            System.out.print("Hey, what's your name?");
            String name = keyboard.next();
            System.out.print("Ok, "+name+", how old are you?");  
            int age = keyboard.nextInt();
            if(age<16)
            {
                System.out.print("You can't drive."+ name);
                System.out.print("You can't vote."+name);
                System.out.print("You can't rent a car."+ name);
            }
            else if (age>16 && age <18)
            {
                System.out.print("You can't vote."+name);
                System.out.print("You can't rent a car."+ name);
            }
           else if (age >18 && age<25)
            {
            System.out.print("You can't rent a car."+ name);
            }
            else{
                System.out.print("You can do anything that's legal."+ name);
            }
        }
    }
}
