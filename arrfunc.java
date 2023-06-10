import java.util.*;
class arrfunc{
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

    public void displayarr(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
       arrfunc ob=new arrfunc();
       int arr[]=ob.inputarr();
       ob.displayarr(arr);        
    }

    public int sum(int[] arr) {
        return 0;
    }

    public int search(int[] arr, int elemen) {
        return false;
    }
}