package leetcode;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str="{([])}";
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='{'||ch=='('||ch=='['){
                stack.push(ch);
            }
            else if(ch=='}'||ch==')'||ch==']'){
                if(stack.isEmpty())return;
                char ch1=stack.pop();
                if(!isPair(ch,ch1))return;
            }
        }
       if(stack.isEmpty()) System.out.println("valid");
    }

    private static boolean isPair(char ch, char ch1) {
        if(ch1=='{'&&ch=='}')return true;
        if(ch1=='('&&ch==')')return true;
        if(ch1=='['&&ch==']')return true;
        return false;
    }
}
