import java.util.Scanner;
public class FindingPrimes {
    public static void main(String[] args)
    {
        try(Scanner kb = new Scanner(System.in))
        {
            System.out.println("Enter max num");
            int val = kb.nextInt();
            if(val<2)
            System.out.println("NO primes in this range");
            else if(val ==2)
            System.out.println(val + "<");
            else{
                isPrime(val);
            }
        }
    }
    public static void isPrime( int n )
    {
        
        for(int i=1;i<=n;i++)
        {
            int count =0;
            for (int j =i;i>1;j--)
            {
            if((i%j)==0)
            {
                // if(i==j)
                // System.out.println(i+" <");
                // else
                // {
                    count++;
               // }
            }
            
        }
        if(count ==2)
        System.out.println(i+" <");
        else
        System.out.println(i);
        }
    }
}
