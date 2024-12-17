package leetcode;

public class KadanesAlgorithm{
    public static void main(String[] args) {
        int arr[]={-1,-2};
        int currSum=0;
        int max=Integer.MIN_VALUE;
        int first,last=0;
        for(int i=0;i<arr.length;i++){
              currSum+=arr[i];
              max=Integer.max(currSum,max);
              if(currSum<0){
                  currSum=0;
              }
        }
        System.out.println(max);

    }
}
