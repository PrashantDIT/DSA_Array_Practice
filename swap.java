public class swap {
    public static void swaparr(int []arr)
    {
        ;
        for(int i=0;i<(arr.length-1);i+=2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        swaparr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
