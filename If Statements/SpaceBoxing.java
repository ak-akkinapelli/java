
import java.util.Scanner;
public class SpaceBoxing {
    public static void main(String [] args)
    {
        try(Scanner  keyboard =new Scanner(System.in))
        {
            System.out.println("Please enter your current earth weight:");
            double weight = keyboard.nextDouble();
            System.out.println("I have information for the following planets:\n  1. Venus   2. Mars    3. Jupiter\n  4. Saturn  5. Uranus  6. Neptune");
            System.out.println("Which planet are you visiting?");
            int num=keyboard.nextInt();
            if(num ==1)
            {
                weight  *= 0.78;
            }
            else if(num ==2)
            {
                weight  *= 0.39;
            }
            else if(num ==3)
            {
                weight  *= 2.65;
            }
            else if(num ==4)
            {
                weight  *= 1.17;
            }
            else if(num ==5)
            {
                weight  *= 1.05;
            }
            else if(num ==6)
            {
                weight  *= 1.23;
            }

            System.out.println("Your weight would be "+weight+" pounds on that planet.");
        }
    }
}
