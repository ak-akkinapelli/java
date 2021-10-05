import java.util.Scanner;
public class Area {
    public static void main(String [] args)
    {
        try(Scanner kb = new Scanner(System.in))
        {
        double area;
        list();
        int entry = kb.nextInt();
        if(entry ==1)
        {
         System.out.println("Base: ");
         int height = kb.nextInt();
         System.out.println("height: ");
         int base = kb.nextInt();
          area = Triangle( base, height);
        System.out.println("The Area is "+ area);
        list();
        }
        else if(entry ==2)
        {
            System.out.println("length: ");
            int length = kb.nextInt();
            System.out.println("breadth: ");
            int breadth = kb.nextInt();
             area =Rectangle(length, breadth);
            System.out.println("The Area is "+ area);
            list();
        }
        else if(entry ==3)
        {
            System.out.println("side: ");
            int side = kb.nextInt();
            
           area=  Square(side);
            System.out.println("The Area is "+ area);
            list();
        }
        else if(entry ==4)
        {
            System.out.println("radius: ");
            int radius = kb.nextInt();
             area =Circle(radius);
            System.out.println("The Area is "+ area);
            list();
        }
        else if(entry ==5)
        {
            return;
        }
        else
        {
            System.out.println("Invalid");
        }

    }
    }
    public static void list()
    {
     System.out.println("1.Traingle\n2.Rectangle\n3.Square\n4.Circle\n5.Quit\nWhich shape");
    }
    public static double Triangle(int x, int y)
    {
        return (0.5*x*y);
    } public static double Rectangle(int x, int y)
    {
        return(x*y);
    } public static double Square(int x)
    {
        return(Math.pow(x,2));

    } public static double Circle(int x)
    {
        return (Math.PI * Math.pow(x,2));
    }

    
}
