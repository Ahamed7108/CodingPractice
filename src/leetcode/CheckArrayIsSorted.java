package leetcode;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        String str="abba";
        long time=System.currentTimeMillis();
        if(palindrome(str)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not and palindrome");
        }
        long time2=System.currentTimeMillis();
        System.out.println(time2-time);
    }

    private static boolean palindrome(String str) {
        if(str.length()==0||str.length()==1)return true;
        if(str.charAt(0)==str.charAt(str.length()-1)) return palindrome(str.substring(1,str.length()-1));
        return false;
    }
}
