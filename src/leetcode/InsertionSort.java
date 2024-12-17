package leetcode;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {30, 10, 11, 2, 1};
        for (int i = 1; i < arr.length; i++) {
            int currValue = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currValue) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currValue;
        }
        for (int k : arr) System.out.print(k + " ");
    }
}
