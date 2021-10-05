import java.util.Scanner;
public class keychainStore {
    
  public static void main(String [] args)
  {
          int choice;
          int count=0;
          System.out.println("Key store");
          choice = menu(); 
          Switch(choice,count);
  }  
  public static int menu()
  {
    System.out.println("1. Add keychains\n2. Remove keychains\n3. View current order\n4. Checkout");
    System.out.print("Please enter your choice: ");
    Scanner kb= new Scanner(System.in);
   
    int val = kb.nextInt();
    //kb.close();
    return val;
    
  }
  public static int add_keychains(int x)
  { Scanner kb = new Scanner(System.in);
    System.out.println("You have "+x+" keychains How many to add?");
    
    int add = kb.nextInt();
    kb.close();
    return(x+add);
  }
  public static int remove_keychains(int x)
  {
    System.out.println("You have "+x+" keychains How many to remove?");
    Scanner kb = new Scanner(System.in);
    int rem = kb.nextInt();

    //kb.close();
    menu();
    if(rem<=x)
    return(x-rem);
    else
    System.out.println("You can't remove more than you have, choose again");
    return 5;
  }
  public static void view_order(int x, int y)
  {
    System.out.println("You have "+x+"keychains\ncost of each is "+y+"rs.\n Total cost is "+(x*y)+"rs.");
  }
  public static void checkout(int x, int y)
  {
      Scanner kb = new Scanner(System.in);
      System.out.println(("What is your name?"));
      String name = kb.next();
    System.out.println("You have "+x+" keychains cost of each is "+y+"rs.\n Total cost is "+(x*y)+"rs.\n Thanks for your order "+name);
   // kb.close();
}
public static void Switch(int choice, int count)
{
    int price = 100;
    int current;
    switch(choice)
          {
              case 1:
              current = add_keychains(count);
              System.out.println("You now have "+current+" keychains");
              count = current;
              choice = menu();
              Switch(count, choice);
              case 2:
             current= remove_keychains(count);
             System.out.println("You now have "+current+" keychains");
              count = current;
              choice = menu();
              Switch(count, choice);
              case 3:
              view_order(count, price);
              choice = menu(); 
              Switch(count, choice);
              case 4:
              checkout(count, price);
              default:
              System.out.println("Wrong choice");
              choice = menu();
              Switch(count, choice);
              
          }
}
}
