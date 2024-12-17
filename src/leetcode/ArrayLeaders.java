package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {
    public static void main(String[] args) {
        int arr[]={30, 10, 10, 5};
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>=arr[j])continue;
                flag=false;
                break;
            }
            if(flag){
                li.add(arr[i]);
            }
        }
        li.add(arr[arr.length-1]);
        li.forEach(k-> System.out.print(k+" "));
    }
}
