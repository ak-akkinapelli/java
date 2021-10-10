import java.util.ArrayList;
public class LargestinArrayList {
    public static void main(String[] args) {
        int biggest;
      //  ArrayList<Integer> arrL = new ArrayList<Integer>(Collections.nCopies(10,0));
      ArrayList<Integer> arrL = new ArrayList<Integer>(10);
        for(int i=0;i<10; i++)
        {
            arrL.add((int)(Math.random()*100));

        }
        biggest=arrL.get(0);
        for(int i=0;i<10;i++)
        {
            if(arrL.get(i)>biggest)
            biggest= arrL.get(i);
        }
        System.out.println(arrL);
        System.out.println(biggest);
    }
    
}
