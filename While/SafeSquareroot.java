import java.util.Scanner;
public class SafeSquareroot {
    public static void main(String [] args)
    {
    try(Scanner keyboard = new Scanner(System.in))
    {
        System.out.print("Enter a number\n");      
        int key = keyboard.nextInt();

            while(key <0){
                System.out.print("Negative number, try again\n");
                key = keyboard.nextInt();
            }
            double temp = Math.sqrt(key);
            System.out.println("the sqrt of given number is "+ temp);
    }
}
}
