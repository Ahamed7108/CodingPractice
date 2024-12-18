import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroesToEnd {

    public static void moveZeroes(int []arr)
    {   
        ArrayList<Integer>list = new ArrayList<>();
        for(int i:arr)
        {
            if(i!=0)
            list.add(i);
        }

        for(int i=0;i<list.size();i++)
        {
            arr[i] = list.get(i);
        }
        for(int i=list.size();i<arr.length;i++)
        arr[i]=0;
    }

    public static void moveZeroesOptimized(int []arr)
    {
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            break;
        }

        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]!=0)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,0,0,1,0,19};

        moveZeroesOptimized(arr);
        System.err.println(Arrays.toString(arr));
    }
}
