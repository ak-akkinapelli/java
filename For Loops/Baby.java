import java.util.Scanner;
public class Baby {
    public static void main(String [] args)
    {
        try(Scanner keyboard = new Scanner(System.in))
        {
            System.out.println("Welcome\n");
            System.out.println("Enter a number between 1-10\n");
            int first = keyboard.nextInt();
            System.out.println("Enter another number between 1-10\n");
            int second = keyboard.nextInt();
            int d1= (int)(Math.random()*10);
            int d2=(int)(Math.random()*10);
            if(Integer.sum(first,second) > Integer.sum(d1,d2))
            {
                System.out.println("You win");
            }
            else
            {
                System.out.println("You lose");
            }
        }
    }
    
}

