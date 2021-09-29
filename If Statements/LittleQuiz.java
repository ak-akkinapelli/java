import java.util.Scanner;
public class LittleQuiz {
    public static void main(String [] args)
    {
        try(Scanner  keyboard =new Scanner(System.in))
        {
            int count=0;
            System.out.println("Are you ready for a quiz? ");
            
            System.out.println("Okay, here it comes!");
            System.out.println("Q1) What is the capital of Alaska?\n1) Melbourne\n2) Anchorage\n3) Juneau");
            int a= keyboard.nextInt();
            if (a==3)
            {
                System.out.println("That's right!");
                count+=count;
            }
            else{
                System.out.println("wrong");
            }
            System.out.println("Q2) Can you store the value cat in a variable of type int?\n1) yes\n2) no");
            int b= keyboard.nextInt();
            if (b==2)
            {
                System.out.println("That's right!"); 
                count+=count;
            }
            else{
                System.out.println("Sorry, cat is a string. ints can only store numbers.");

            }
            System.out.println("Q3) What is the result of 9+6/3?");
            
            int c= keyboard.nextInt();
            if (c==2)
            {
                System.out.println("That's right!"); 
                count+=count;
            }
            System.out.println("Overall, you got "+count+" out of 3 correct.");
        }
    }
}
