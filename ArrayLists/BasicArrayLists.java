import java.util.ArrayList;

public class BasicArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrL = new ArrayList<Integer>(10);
        for(int i=0;i<10;i++)
        {
            arrL.add(-113);
            System.out.printf("Slot %d contains a %d\n",i,arrL.get(i));
        }
        
    }
}
