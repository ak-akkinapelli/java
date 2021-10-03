import java.util.Scanner;
public class CummulativeSum {
    public static void main(String [] args)
    {
    try(Scanner keyboard = new Scanner(System.in))
    {
        int temp=0;
        System.out.print("I'll add the numbers you give me \nNumber: ");
        int number = keyboard.nextInt();
        while(number !=0)
        {
            temp+=number;
            System.out.println("The total so far is " + temp+"\nNumber: ");
            number = keyboard.nextInt();
        }
        System.out.println("The total is "+temp);
    }
}
}