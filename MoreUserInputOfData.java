import java.util.Scanner;
public class MoreUserInputOfData {
    public static void main(String [] args)
    {
        try(Scanner keyboard = new Scanner(System.in))
        {
            System.out.println("Please enter the following information so I can sell it for a profit!");
            System.out.print("First name: ");
            String name = keyboard.next();
            System.out.print("Last name: ");
            String Lname = keyboard.next();
            System.out.print("Grade (9-12): ");
            int grade = keyboard.nextInt();
            System.out.print("Student ID: ");
            int ID = keyboard.nextInt();
            System.out.print("Login: ");
            String Login = keyboard.next();
            System.out.print("GPA (0.0-4.0): ");
            int gpa = keyboard.nextInt();

            System.out.println("Your Info");
            System.out.println("Login: " + Login +"\n" +
            "ID: "   +ID +"\n" +
            "Name: " + Lname + " "+name +"\n" +
            "GPA: "  +gpa  +"\n" +
            "Grade:" + grade);

        }
    }
    
}