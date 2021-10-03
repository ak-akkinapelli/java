import java.util.Scanner;
public class EnterPin {
    public static void main(String[] args)
    {
        try(Scanner keyboard = new Scanner(System.in))
        {
            int count =3;
            int pin =1234;
            System.out.println("Welcome to bank\nEnter your pin");
            int entry = keyboard.nextInt();
            while(entry != pin && count >1)
            {
                count-=1;
                System.out.println("Wrong pin\n attemptes left "+count);
                entry = keyboard.nextInt();
            }
            if (entry == pin)
            {
                System.out.println("Logged in");
                return;
            }
            System.out.println("Account blocked");

        }
    }
}
