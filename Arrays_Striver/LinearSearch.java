public class LinearSearch {

    public static int findElement(int arr[], int ele)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(ele == arr[i])
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6,7};
        int ele=7;
        ele = findElement(arr, ele);
        System.out.println(ele);
    }
}
