import java.util.HashMap;

public class LongestSubArrayKSum {
    
    // public static int longestSubArray(int []arr, int k)
    // {
        
    // }

    public static int longestSubArrayOptimized(int arr[], int k)
    {
        int maxLen = 0;
        int sum=0;
        int left=0, right=0;
        while(right<arr.length)
        {
            sum = sum+ arr[right];
            if(sum==k)
            maxLen = Math.max(maxLen, right-left+1);

            while(sum>k && left<=right)
            {
                sum=sum-arr[left];
                left++;
            }

            right++;
        }
        return maxLen;
    }

    public static int longestSubArrayBetter(int arr[], int k)
    {
        int maxLen=0;
        int sum=0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                maxLen = Math.max(maxLen, i+1);
            }
            int rem = sum-k;
            if(prefixSumMap.containsKey(rem))
            {
                maxLen = Math.max(maxLen, i-prefixSumMap.get(rem));
            }
            prefixSumMap.put(sum, i);
            
            // if(!(prefixSumMap.containsKey(sum)))
            // {
            //     prefixSumMap.put(sum, i);
            // }
            System.out.println("Map "+prefixSumMap);
        }
        return maxLen;
    }
    
    public static void main(String[] args) {

        int arr[] = {1,2,3,1,1,1,1,4,2,3};

        // int arr[] = {2,0,0,3};

        System.out.println(longestSubArrayOptimized(arr, 3));
        
    }
}
