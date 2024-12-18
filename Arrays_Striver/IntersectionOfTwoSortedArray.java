import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoSortedArray {

    public static int[] findIntersectionOptimized(int []a1, int[]a2)
    {
        
    }

    public static int[] findIntersection(int []a1, int[]a2)
    {
        int []visited = new int[a2.length];

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++)
            {
                if(a1[i]==a2[j] && visited[j]==0)
                {
                    list.add(a1[i]);
                    visited[j]=1;
                    break;
                }
                if(a1[i]<a2[j])
                break;
            }
        }
        int union[] = new int[list.size()];
        int p=0;
        for(int i:list)
        {
            union[p] = i;
            p++;
        }
        return union;
    }

    public static void main(String[] args) {
        int a1[] = {1,1,2,3,4,4,4,5};
        int a2[] = {2,3,4,4,5,6};

        int union[] = findIntersection(a1, a2);
        // int union[] = findIntersectionOptimized(a1, a2);
        
        System.out.println(Arrays.toString(union));
    }
}
