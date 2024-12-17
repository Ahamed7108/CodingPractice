package leetcode;

public class Sort0S1S2S {
    public static void main(String[] args) {
        int sorted[]={0,1,2,0,1,2};
        int low=0;
        int high=sorted.length-1;
        int mid=0;
        while(mid<=high){
            switch (sorted[mid]){
                case 0:
                    int temp=sorted[low];
                    sorted[low]=sorted[mid];
                    sorted[mid]=temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2=sorted[mid];
                    sorted[mid]=sorted[high];
                    sorted[high]=temp2;
                    high--;
                    break;
            }
        }
    }
}
