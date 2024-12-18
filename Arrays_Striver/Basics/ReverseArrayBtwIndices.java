package Basics;
public class ReverseArrayBtwIndices{
//1 2 3 4 5 6
//0 1 2 3 4 5  
    public static void reverseArrayBetween(int []arr, int startIndex, int endIndex)
    {
        while(startIndex<endIndex)
        {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }


    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        // reverseArr(arr);S
        for(int i:arr)
        System.out.print(i+" ");

        int startIndex = 0;
        int endIndex = 5;
        // System.out.println("\nSwapping btw "+startIndex+" and "+endIndex);
        
        reverseArrayBetween(arr,startIndex, endIndex);
        System.out.println("\nAfter reversing");
        for(int i:arr)
        System.out.print(i+" ");
    }
}