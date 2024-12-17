package leetcode;

import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArray {
    public static void main(String[] args) {
        int a[]={2, 2, 3, 4, 5};
        int b[]={1, 1, 2, 3, 4};
        int i=0;
        int j=0;
        List<Integer> li=new ArrayList<>();
        while (i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                if(li.size()==0||li.contains(a[i])==false){
                    li.add(a[i]);
                }
                i++;
            }
            else{
                if(li.size()==0||!li.contains(b[j])){
                    li.add(b[j]);
                }
                j++;

            }
        }
        while(i<a.length) {
            if (li.size() == 0 || !li.contains(a[i])) {
                li.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(li.size() == 0 || !li.contains(b[j])) {
                li.add(b[j]);
            }
            j++;
        }
        li.forEach(k-> System.out.print(k+" "));

    }
}
