import java.util.Scanner;

public class pairsum {
    public static void pair(int arr[], int sum)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==sum)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pairsum ob=new pairsum();
        int []arr1={1,3,6,2,5,4,3,2,4};
        int sum=7;
        ob.pair(arr1, sum);
    }
}
