import java.util.Scanner;
public class BMICalc {
    public static void main(String [] args)
    {
        try(Scanner keyboard = new Scanner(System.in))
        {
            System.out.println("Your height (feet only):");
            int height = keyboard.nextInt();
            System.out.println("Your height (inches):");
            int inches = keyboard.nextInt();
            System.out.println("Your weight in pounds: ");
            int weight = keyboard.nextInt();
            double BMI = (weight/2.205)/Math.pow((height/3.281 + inches/39.37),2);
            System.out.println("Your BMI is " + BMI );
        }
    }
}
