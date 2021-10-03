public class XsAndYs {
    public static void main(String [] args)
    {   
        System.out.println("x \t y\n -----------");
            for(double x = -10.0; x<=10;x+=0.5)
            {
                //System.out.print(x+ "\t");
                
                for(double y = Math.pow(x,2); y<=100.00;)
                {
                    System.out.print(y);
                }
            }
    }
}
