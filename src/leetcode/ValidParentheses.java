package leetcode;

import edu.princeton.cs.algs4.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 == 1) return false;
        Stack  stack = new Stack();
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i++) {
            if (chars[i] == '(' ) {
                stack.push(chars[i]);
            } else if (chars[i] == '[') {
                stack.push(chars[i]);
            } else if (chars[i] == '{') {
                stack.push(chars[i]);
            } else if (chars[i] == ')') {
                if (stack.size() == 0) return false;
                if ((char)stack.pop() != '(') return false;
            } else if (chars[i] == ']') {
                if (stack.size() == 0) return false;
                if ((char)stack.pop() != '[') return false;
            } else if (chars[i] == '}') {
                if (stack.size() == 0) return false;
                if ((char)stack.pop() != '{') return false;
            }
        }
        if (stack.size() != 0) return false;
        return true;
    }

}
