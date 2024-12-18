public class CheckArrayIsSorted {

    //O(N*2)
    public static boolean isSorted(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]> arr[j])
                return false;
            }
        }
        return true;
    }

    //O(N)
    public static boolean isSortedOptimized(int []arr)
    {
        if(arr.length ==0 || arr.length == 1)
        return true;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {10,10,10};

        System.out.println(isSorted(arr));
        System.out.println(isSortedOptimized(arr));
    }
}
