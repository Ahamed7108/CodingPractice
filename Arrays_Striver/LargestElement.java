public class LargestElement {

    public static int findLargestOptimized(int []arr)
    {
        int largest = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(largest < arr[i])
            largest = arr[i];
        }
        return largest;

    }

    public static void main(String[] args) {
        int arr[] = {10,34,22,67,45,72};

        System.out.println(findLargestOptimized(arr));
    }
}
