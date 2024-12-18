import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {

    // O(NLOGN), S.C.=O(N)
    public static int removeDuplicates(int []arr)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr)
        set.add(i);

        int j=0;
        for(int i:set)
        {
            arr[j] = i;
            j++;
        }
        return j;
    }

    // O(N)
    public static int removeDuplicatesOptimized(int []arr)
    {
        // 1,2,2,3,3,3,4,5,6,7,7,8
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]!=arr[i])
            {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    
    public static void main(String[] args) {
        int arr[]= {1,2,2,3,3,3,4,5,6,7,7,8};

        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

        System.out.println();

        // int k=removeDuplicates(arr);
        int k=removeDuplicatesOptimized(arr);
        
        System.out.println("k :"+k);
        for(int i=0;i<k;i++)
        System.out.print(arr[i]+" ");
    }
}
