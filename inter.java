public class inter {
    public static int[] intersection(int[] arr1, int[] arr2)
    {
        int[] res=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j])
                res[i]=arr1[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int []arr1={1,4,5,6,3,7};
        int []arr2={1,2,3,4,5,6,7};
        int []arr3=intersection(arr1,arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}
