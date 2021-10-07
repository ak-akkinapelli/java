public class multTable {

    public static void main(String[] args) {
        int x;
        int y;
        for(int i=10;i<100;i++)
        {
            x= i/10;
            y=i%10;
            System.out.printf("%d, %d + %d = %d\n",i,x,y,(x+y));
        }
    }
}
