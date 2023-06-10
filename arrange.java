import java.util.*;
public class arrange {
    public int[] arrange(int arr[], int n)
    {
        int num=1;
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            arr[i]=num;
            num++;
            i++;
            arr[j]=num;
            num++;
            j--;
        }
        if(i==j)
        arr[i]=num;
        return arr;
    }
    public static void main(String[] args) {
        arrange ob=new arrange();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=ob.arrange(arr, n);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
