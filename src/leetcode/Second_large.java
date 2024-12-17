package leetcode;

public class Second_large {
    public static void main(String[] args) {
        int arr[] = {8, 2, 4, 5, 3, 7, 1};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int k : arr) {
            if (k > largest) {
                second = largest;
                largest = k;
            }
            if (k > second && k != largest) {
                second = k;
            }
        }
        System.out.println(second);
    }
}
