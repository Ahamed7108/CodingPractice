package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class UniqueElementOfArray {
    //oneUnique Element in an array
    public static void main(String[] args) {
        int arr[]={2,1,2};
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            if(!q.isEmpty()&&q.contains(arr[i])){
                q.remove(arr[i]);
            }
            else{
                q.add(arr[i]);
            }

        }
        q.forEach(k-> System.out.print(k+" "));
    }
}
