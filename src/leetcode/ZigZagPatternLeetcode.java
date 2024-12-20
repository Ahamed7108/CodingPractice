package leetcode;

import java.util.Scanner;

public class ZigZagPatternLeetcode {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str = s.nextLine();
        int num=s.nextInt();
        String[] s1 = new String[3];
        int i = 0;
        int d = 0;
        for (int j = 0; j < str.length(); j++) {
            if (s1[i] == null) {
                s1[i] = "";
                s1[i] = s1[i] + str.charAt(j);
            } else {
                s1[i] = s1[i] + "" + str.charAt(j);
            }
            if (i == 0) d = 1;
            else if (i == num - 1) d = -1;
            i += d;
        }
        for (String k : s1) System.out.print(k);
    }
}

