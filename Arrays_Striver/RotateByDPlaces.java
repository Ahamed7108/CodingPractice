public class RotateByDPlaces {

    public static void leftRotateDPlaces(int []arr, int d)
    {
        int a[] = new int[d];
        for(int i=0;i<d;i++)
        a[i] = arr[i];

        for(int i=d;i<arr.length;i++)
        arr[i-d] = arr[i];

        for(int i=arr.length-d;i<arr.length;i++)
        arr[i] = a[i-(arr.length-d)];
    }

    public static void rightRotateDPlaces(int []arr, int d)
    {
        d=arr.length - (d%(arr.length));
        leftRotateDPlaces(arr, d);
    }

    public static void reverseBetween(int []arr, int start, int end)
    {
        if(start<0 || end>=arr.length)
        System.out.println("Invalid indices");
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotateDPlacesOptimized(int []arr, int d)
    {
        d=d%arr.length;
        reverseBetween(arr,0,d-1);
        reverseBetween(arr,d,arr.length-1);
        reverseBetween(arr,0,arr.length-1);
    }

    public static void rightRotateDPlacesOptimized(int []arr, int d)
    {
        d=arr.length - (d%arr.length);
        
        reverseBetween(arr,0,d-1);
        reverseBetween(arr,d,arr.length-1);
        reverseBetween(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int d=2;
        // leftRotateDPlaces(arr, d);
        rightRotateDPlaces(arr, d);
        for(int i:arr)
        System.out.print(i+" ");
    }
}
