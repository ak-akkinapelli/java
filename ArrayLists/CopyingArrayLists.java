import java.util.ArrayList;

public class CopyingArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrL = new ArrayList<Integer>(10);
        ArrayList<Integer> arrL2 = new ArrayList<Integer>(10);
        for (int counter=0;counter<10;counter++)
        {
            arrL.add((int)(Math.random()*100));
        }
        for (int counter=0;counter<arrL.size();counter++)
        {
            arrL2.add(arrL.get(counter));
        }
        arrL.set(arrL.size()-1, -7);
      // System.out.print(arrL.size());
        for(int counter =0;counter<arrL.size();counter++)
        {
           
            System.out.printf(arrL.get(counter)+"\t");
           
        }
        System.out.print("\n");
        for(int counter =0;counter<arrL.size();counter++)
        {
           
        System.out.print(arrL2.get(counter)+"\t");
        }
    }
}
