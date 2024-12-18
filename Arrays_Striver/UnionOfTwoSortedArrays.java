import java.util.*;

public class UnionOfTwoSortedArrays {

    public static int[] findUnionOptimized(int []a1, int[]a2)
    {
        int i=0;
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<a1.length && j<a2.length)
        {
            if(a1[i]<=a2[j])
            {
                if(list.size()==0 || (list.get(list.size()-1)!=a1[i]))
                list.add(a1[i]);
            i++;
            }
            else
            {
                if(list.size()==0 || (list.get(list.size()-1)!=a2[j]))
                list.add(a2[j]);
            j++;
            }
        }
        while(i<a1.length)
        {
            if(list.get(list.size()-1)!=a1[i])
                {
                    list.add(a1[i]);
                }
                i++;
        }
        System.out.println("list - "+list);
        while(j<a2.length)
        {
            if(list.get(list.size()-1)!=a2[j])
                {
                    list.add(a2[j]);
                }
                j++;
        }
        int union[]=new int[list.size()];
        int p=0;

        for(int k:list)
        {
            union[p]=k;
            p++;
        }
        return union;

    }

    public static int[] findUnion(int []a1, int[]a2)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i:a1)
        set.add(i);

        for(int i:a2)
        set.add(i);

        int union[] = new int[set.size()];
        
        int i=0;
        for(int p:set)
        {
            union[i] = p;
            i++;
        }
        return union;
    }

    public static void main(String[] args) {
        int a1[] = {1,1,2,3,4,5};
        int a2[] = {2,3,4,4,5,6};

        int union[] = findUnionOptimized(a1, a2);
        
        for(int i=0;i<union.length;i++)
        System.out.print(union[i]+" ");

    }
}
