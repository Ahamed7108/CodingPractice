package leetcode;

public class indexOfSubArray {
    public static void main(String[] args) {
        int first=0;
        int end=0;
        int count=0;
        int arr[]={1 ,4 ,3 ,3, 5, 5};
        int target=16 ;
        int curr=0;
        while(end<arr.length){
            curr+=arr[end];
            count++;
            if(curr==target){
                System.out.println(count);
                return;
            }
            while(curr>target&&first<end){
                curr-=arr[first];
                first++;
                count--;
            }
            end++;
        }

    }
}
