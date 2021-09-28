import java.util.Scanner;
public class DumbCalculator {
    public static void main(String [] args)
    {
        try(Scanner keyboard = new Scanner(System.in))
        {
            System.out.println("What is your first number?");
            double one = keyboard.nextDouble();
            System.out.println("What is your second number?");
            double two = keyboard.nextDouble();
            System.out.println("What is your thrid number?");
            double three = keyboard.nextDouble();
            double sum = (one+two+three)/2;
            System.out.println("("+String.valueOf(one) + "+"+ String.valueOf(two) +"+"+ String.valueOf(three)+")/2 is... "+sum);

        }
    }
}
