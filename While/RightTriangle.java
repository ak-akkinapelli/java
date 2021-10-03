import java.util.Scanner;
public class RightTriangle {
    
    public static void main(String [] args)
    {
    try(Scanner keyboard = new Scanner(System.in))
        {
            System.out.print("Enter side 1\n");
            int side1 = keyboard.nextInt();
            while(side1<=0)
            {
                System.out.println("Should be greater than 0\n");
                side1 = keyboard.nextInt();
            }
            System.out.print("Enter side 2\n");
            int side2 = keyboard.nextInt();
            while(side2<side1)
            {
                System.out.println("Should be greater than side1\n");
                side2 = keyboard.nextInt();
            }
            System.out.println("Enter side 3\n");
            int side3 = keyboard.nextInt();
            while(side3<side2)
            {
                System.out.println("Should be greater than side2\n");
                side3 = keyboard.nextInt();
            }
            if(Math.pow(side3,2)== (Math.pow(side1,2)+ Math.pow(side2,2)))
            {
                System.out.println("Can make a right traingle"); 
            }
            else{
                System.out.println("Can't make a right traingle"); 
            }

        }
}
}
