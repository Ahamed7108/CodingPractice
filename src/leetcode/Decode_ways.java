package leetcode;

public class Decode_ways {
    public static void main(String[] args) {
        String str="12";
        Integer[]i=new Integer[str.length()+1];
       int k= helper(str,str.length(),i);
        System.out.println(k);
    }

    private static int helper(String str, int length,Integer[] memo) {
        if(length==0)return 1;
        int data=str.length()-length;
        if(str.charAt(data)=='0')return 0;
        if(memo[length]!=null){
            return memo[length];
        }
        int result=helper(str,length-1,memo);
        if(length>=2&&Integer.parseInt(str.substring(data,data+2))<=26){
            result+=helper(str,length-2,memo);
        }
        memo[length]=result;
return result;
    }
}
