package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber lc = new LetterCombinationsOfAPhoneNumber();
        String num = "25";
        List list = lc.letterCombinations(num);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public List<String> letterCombinations(String digits) {
        List list = new LinkedList();
        if (digits != null && digits.equals(""))
            return list;
        char[] chars = digits.toCharArray();
        int[] ints = new int[chars.length];
        String[] strings = new String[ints.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int)chars[i] - 48;
            strings[i] = numToStr(ints[i]);
        }
        breadth(strings, 0, list, "");
        return list;
    }

    /**
     * 广度遍历
     * @param strings  字符串数组
     * @param pos 当前遍历位置字符串
     * @param list 存放结果
     * @param s 临时字符串
     */
    public void breadth(String[] strings, int pos, List list, String s) {
        if (pos == strings.length) {
            list.add(s);
            return;
        }
        String str = strings[pos];
        for (int i = 0; i < str.length(); i++) {
            String s1 = new String(s);  //String传引用
            s1 += str.charAt(i);
            breadth(strings, pos + 1, list, s1);
        }
    }
    
    public String numToStr(int num) {
        switch (num) {
            case 2: return "abc";
            case 3: return "def"; 
            case 4: return "ghi"; 
            case 5: return "jkl"; 
            case 6: return "mno"; 
            case 7: return "pqrs"; 
            case 8: return "tuv"; 
            case 9: return "wxyz"; 
            default: return "";
        }
    }
}
