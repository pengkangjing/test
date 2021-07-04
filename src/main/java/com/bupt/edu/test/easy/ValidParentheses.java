package com.bupt.edu.test.easy;

import java.util.Stack;

/**
 * @Author :pengkangjing
 * @Date : 2021-02-25 20:02
 * @Version : 1.0
 */

public class ValidParentheses {
    public static void main(String[] args){

        String input = args[0];

        ValidParentheses validParentheses = new ValidParentheses();

        validParentheses.testValidParentheses(input);
    }

    public boolean testValidParentheses(String s){
        Stack<Character> stack = new Stack<Character>();
        if(s.length() == 0){
            return true;
        }

        if(s.length()%2 != 0){
            return false;
        }
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char c = stack.peek();
            if((c =='(' && s.charAt(i) == ')') || (c =='{' && s.charAt(i) == '}') || (c =='[' && s.charAt(i) == ']')){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }

        if(stack.size()==0){
            return true;
        }else{
            return false;
        }
    }
}
