package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str="1b1";
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            char first=str.charAt(start);
            char last=str.charAt(end);
            if(!Character.isLetterOrDigit(first))start++;
            else if(!Character.isLetterOrDigit(last)){end--;}
            else {
                if (Character.toLowerCase(first)!=Character.toLowerCase(last)) {
                    System.out.println("false");
                    return;
                }
            }
            start++;
            end--;
        }
        System.out.println("true");
    }
}
