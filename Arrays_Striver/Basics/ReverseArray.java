package Basics;
public class ReverseArray{
//1 2 3 4 5 6
//0 1 2 3 4 5  
    public static void reverseArrayBetween(int []arr, int startIndex, int endIndex)
    {
        int len = (endIndex - startIndex)+1;
        System.out.println("Length :"+len);
        for(int i=startIndex;i<=(startIndex+endIndex)/2; i++)
        {
            System.out.println("Start "+i+" endIndex "+endIndex+ ", Swap "+arr[i]+" and "+arr[endIndex]);
            int temp = arr[i];
            arr[i] = arr[endIndex];
            arr[endIndex] = temp;
            System.out.println("After swapping "+arr[i]+" "+arr[len-i-1]);
            endIndex--;
        }
    }

    public static void reverseArr(int []arr)
    {
        for(int i=0;i<arr.length/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println("Inside");
        for(int i:arr)
        System.out.print(i+" ");
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        // reverseArr(arr);S
        for(int i:arr)
        System.out.print(i+" ");
        int startIndex = 0;
        int endIndex = 5;
        System.out.println("\nSwapping btw "+startIndex+" and "+endIndex);
        
        reverseArrayBetween(arr,startIndex, endIndex);
        for(int i:arr)
        System.out.print(i+" ");
    }
}