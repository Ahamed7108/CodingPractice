package leetcode;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LinkedList{
    public static void main(String[] args) {

      int[]a={5,7,7,8,8,10};
      int target=8;
      int[]k=sat(a,target);
      for(int i:k) System.out.print(i+" ");


    }

    private static int[] sat(int[] a, int target) {
        int[] res={-1,-1};
        int start=0;
        int end=a.length-1;
        int count=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==target){
                res[count++]=mid;
            }
            if(target<=a[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }


}
