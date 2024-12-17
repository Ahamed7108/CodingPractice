package leetcode;

public class ZerosToEnd {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,5,0,1};
        int replace=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0&&replace==-1){
                replace=i;
            }
            if(arr[i]>0&&replace>=0){
                int temp=arr[replace];
                arr[replace]=arr[i];
                arr[i]=temp;
                replace++;
            }
        }
        for(int k:arr) System.out.print(k+" ");
    }
}
