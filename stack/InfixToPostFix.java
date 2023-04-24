package stack;

import java.util.*;

public class InfixToPostFix {
    public static void main(String[] args) 
    {
        // String str = "x^y/(a*z)+b";
        String str = "a+b*(c^d-e)^(f+g*h)-i";

        Stack<Character> stk = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()) {

            if(ch >='a' && ch <='z') sb.append(ch);
            else if(stk.isEmpty()) stk.push(ch);
            else if(ch == '(') stk.push(ch);
            else if(ch == ')') {
                while((stk.peek() != '(')) {
                    char s = stk.peek();
                    sb.append(s);
                    stk.pop();
                }
                stk.pop();
            }
            else {
                
                while(stk.size() > 0 && stk.peek() != '(' &&
                 precedences(stk.peek()) >= precedences(ch)) {
                     char ns = stk.peek();
                     sb.append(ns);
                     stk.pop();
                 }
                    stk.push(ch);
            }
        }

        while(stk.size() != 0) {
           
            sb.append(stk.peek());
            
            stk.pop();
        }

        System.out.println(sb.toString());
    }


    static int precedences(char ch) {
        if(ch == '^') return 3;
        else if(ch == '/' || ch == '*') return 2;
        else if(ch == '+' || ch == '-') return 1;
        return 0;
    }
}
