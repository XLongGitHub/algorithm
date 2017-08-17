package leetcode;

import java.util.*;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        GenerateParentheses g = new GenerateParentheses();
        List list = g.generateParenthesis(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "  ");
        }
    }

    public List<String> generateParenthesis(int n) {
        Set<String> set = new HashSet(); //set过滤
        int first = 1;
        int end = 0;
        int pos = 2 * n;

        breadth(set, "(", n, pos - 1, first, end);
        return new ArrayList<>(set);//set to list
    }

    /**
     *
     * @param set
     * @param s     临时穿
     * @param n
     * @param pos   字符位置
     * @param first 前括号
     * @param end   后括号个数
     */
    public void breadth(Set set, String s, int n, int pos, int first, int end) {
        String[] parentheses = {"(", ")"};
        if (pos == 0) {
            set.add(s);
            return;
        }
        for (int i = 0; i < 2; i++) {
            if (first == n) {
                String s1 = new String(s) + parentheses[1];
                breadth(set, s1, n, pos - 1, first, end + 1);
            } else if (end == n) {
                String s1 = new String(s) + parentheses[0];
                breadth(set, s1, n, pos - 1, first + 1, end);
            } else {
                String s1 = new String(s) + parentheses[i];
                if (i == 0) {
                    breadth(set, s1, n, pos - 1, first + 1, end);
                } else if (end < first) {
                    breadth(set, s1, n, pos - 1, first, end + 1);
                }
            }
        }
    }
}
