package com.company;

import java.util.Stack;

/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.

 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> open = new Stack<>();
        if (s.length() % 2 > 0) return false;
            for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') open.push(c);
            else if(open.isEmpty()) return false;
            else if (c == ')') {
                if (open.pop() != '(') return false;
            }
            else if (c == ']') {
                if (open.pop() != '[') return false;
            }
            else if (c == '}') {
                if (open.pop() != '{') return false;
            }

        }
        return open.isEmpty();

    }
}
