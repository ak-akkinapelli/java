public class ArrayBasics {
    public static void main(String[] args) {
         int[] arr= new int[10];
        for(int i=0;i<(arr).length;i++)
        {
            arr[i]= -113;
            System.out.printf("Slot %d contains a %d\n",i,arr[i]);
        }
    }
    
}
