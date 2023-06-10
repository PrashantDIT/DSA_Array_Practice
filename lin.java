import java.util.Scanner;

public class lin {
    public int[] inputarr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public int search(int arr[], int ele)
    {
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == ele){    
                return i;    
            }    
        }    
        return -1;   
    }

     public static void main(String[] args) {
       arrfunc ob=new arrfunc();
       Scanner sc=new Scanner(System.in);
       int arr[]=ob.inputarr();
       System.out.println("Enter element to be searched");
        int elemen=sc.nextInt();
        int res=ob.search(arr, elemen);
        System.out.println(res);
     }
}
