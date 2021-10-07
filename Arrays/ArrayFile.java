import java.util.Scanner;
public class ArrayFile {
   public static void main(String[] args) {
       try(Scanner kb = new Scanner(System.in))
       {
        System.out.print("Name");
        String name = kb.next();
        System.out.println("Filename");
        String file = kb.next();
        System.out.println("Random grades");
        for(int i =0;i<5;i++)
        {
            System.out.printf("Grade %d: %d\n",i,(int)(Math.random()*100));
        }
        System.out.println("Data Saved in "+file);
       }
   } 
}
