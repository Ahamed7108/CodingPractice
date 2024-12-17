package leetcode;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        String str="ABC";
        String convert=CONVERT(str,row);
        System.out.println(convert);
    }

    private static String CONVERT(String str,int row) {
        String str1="";
        String[][]a=new String[row][(str.length()/2)+1];
        int d=(a.length)/2;
        int k=0;
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a.length;j++){
                if(i==0||d==0){
                    if(k==str.length())break;
                    a[j][i]=String.valueOf(str.charAt(k));
                    k++;
                    if(j==a.length-1){
                        d=a.length/2;
                    }

                }
                else{
                    if(k==str.length())break;
                    a[d][i]=String.valueOf(str.charAt(k++));
                    d--;
                    break;
                }

            }
        }
        for(String []temp:a){
            for(String k1:temp){
                if(k1==null)continue;
                str1=str1+k1;
            }
        }
        return str1;
    }
}
