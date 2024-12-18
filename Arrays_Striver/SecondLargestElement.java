public class SecondLargestElement {

    // public static int find2ndLargest(int []arr)
    // {
    //     int largest=arr[0];

    // }

    // O(2*N)
    public static int find2ndLargestBetter(int []arr)
    {
        int largest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(largest<arr[i])
            largest = arr[i];
        }
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<largest)
            secondLargest = Math.max(secondLargest, arr[i]);
        }
        System.out.println("Largest : "+largest);
        return secondLargest;
        
    }

    //O(N)
    public static int find2ndLargestOptimized(int []arr)
    {
        int largest=arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest < arr[i])
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if((arr[i]< largest) && (arr[i]> secondLargest))
            secondLargest = arr[i];
        }
        System.out.println("Largest : "+largest);
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {10,43,22,35,6,23};

        // System.out.println(find2ndLargest(arr));

        System.out.println("Better : "+find2ndLargestBetter(arr));

        System.out.println("Optimized : "+find2ndLargestOptimized(arr));
    }
}
