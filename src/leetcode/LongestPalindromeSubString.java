package leetcode;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
         String str="maafdmz";
         String k=validPalindrome(str);
        System.out.println(k);
    }

    private static String  validPalindrome(String str) {
        if (str == null || str.length() < 1) return "";

        int start = 0, end = 0;
        for (int i = 0; i < str.length(); i++) {
            int len1 = expand( str,i, i);     // odd length palindromes
            int len2 = expand(str, i, i + 1);  // even length palindromes
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return str.substring(start, end + 1);
    }
    private static int expand(String s,int left,int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
