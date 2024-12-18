package leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,11,30,40};
        int start=0;
        int end=arr.length-1;
        int target=5;
        int k=search(arr,start,end,target);
        System.out.println(k);
    }

    private static int  search(int[] arr,int start,int end,int target){
        if(start>end)return -1;
        int mid=(start+end)/2;
        if(arr[mid]==target)return mid;
        if (target<arr[mid])return search(arr,start,mid-1,target);
        return search(arr,mid+1,end,target);
    }
}
