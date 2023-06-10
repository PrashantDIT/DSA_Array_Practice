import java.util.*;
class arrsum{
    public int[] inputarr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public int sum(int arr[])
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
       arrfunc ob=new arrfunc();
       int arr[]=ob.inputarr();
       int sum=ob.sum(arr);
       System.out.println("The sum of elements are :"+sum);        
    }
}