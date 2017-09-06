package algorithm4.chpterOneAfter;//package algorithm4.chpterOne.afterClass;

import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Stack<Character> os = new Stack<>();
        Stack<Double> vals = new Stack<>();

        String str = "(1 + ( ( 2 + 3 ) * ( 4 * 5) ) )";
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if (tmp == ' ' || tmp == '(') continue;
            else if (tmp == '+' || tmp == '-' || tmp == '*' || tmp == '/') os.push(tmp);
            else if (tmp == ')') {
                char o = os.pop();
                double val = vals.pop();
                if (o == '+') vals.push(vals.pop() + val);
                else if (o == '-') vals.push(vals.pop() - val);
                else if (o == '*') vals.push(vals.pop() * val);
                else vals.push(vals.pop() / val);
            } else vals.push((double)tmp - 48);
        }
        System.out.println(vals.pop());
    }
}
