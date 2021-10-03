import java.util.Scanner;

public class GuessNumber {
    public static void main (String [] args)
    {
        try(Scanner keyboard = new Scanner(System.in))
        {
            int guess =3;
            System.out.println("Choose a number between 1 to 10");
            int entry= keyboard.nextInt();
            while(entry != guess)
            {
                System.out.println("wrong");
                entry= keyboard.nextInt();
            }
            System.out.println("yay, you guessed it " + entry);

        }
    }
}
