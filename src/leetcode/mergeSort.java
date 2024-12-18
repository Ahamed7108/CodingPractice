package leetcode;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={8,2,3,4,5,6,11,1};
        sort(arr);
        for(int k:arr) System.out.print(k+" ");
    }

    private static void sort(int[] arr) {
        if(arr.length==1)return;
        int left[]=new int[arr.length/2];
        int right[]=new int[arr.length- left.length];
        int i=0;
        int j=0;
        while(i<left.length){
            left[i]=arr[i];
            i++;
        }
        while(j<right.length){
            right[j]=arr[i];
            i++;
            j++;
        }
        sort(left);
        sort(right);
        merge(left,right,arr);
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j])arr[k++]=left[i++];
            else arr[k++]=right[j++];

        }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
    }
}
