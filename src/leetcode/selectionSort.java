package leetcode;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]={30,10,2,3,11};
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    index=j;
                    min=arr[j];
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
        for(int k:arr) System.out.print(k+" ");

    }
}
