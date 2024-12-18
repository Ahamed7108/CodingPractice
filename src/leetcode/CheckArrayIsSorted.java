package leetcode;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int arr[]={50,1,20,1};
        int temp=arr[0];
        boolean flag=false;
        for(int i=1;i<arr.length;i++){
            if (temp <= arr[i]) {
                temp = arr[i];
            }
            else{
                flag=true;
                break;
            }

        }
        if(flag){
            System.out.println("Array is not sorted");
        }
        else{
            System.out.println("ARRAY IS SORTED");
        }
    }
}
