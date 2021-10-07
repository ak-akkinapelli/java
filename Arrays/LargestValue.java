public class LargestValue {
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*100);
            System.out.print(arr[i]+"\t");
        }

        int temp=arr[0];
        for(int x=0;x<arr.length-1;x++){
        if(arr[x]<arr[x+1])
        {
            temp = arr[x+1];
        }
        }
        System.out.printf("The Largest is %d",temp);
    }
    
}
