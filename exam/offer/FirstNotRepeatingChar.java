package offer;

import java.util.*;

/**
 * Created by Xulong on 2017/3/26.
 * 第一个只出现一次的字符
 */
public class FirstNotRepeatingChar {

    public static void main(String[] args) {
        FirstNotRepeatingChar f = new FirstNotRepeatingChar();
        String str = "NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp";
        System.out.println(f.FirstNotRepeatingChar(str));
    }

    public int FirstNotRepeatingChar(String str) {
        int[] ints = new int['z'+1];
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
            ints[chars[i]] += 1;

        for (int i = 0; i < chars.length; i++)
            if (ints[chars[i]] == 1)
                return i+1;
        return -1;
//        List<Character> list = new ArrayList<Character>();
//        for (int i = 0; i < chars.length; i++)
//            if (chars[i] == 1)
//                list.add(chars[i]);
//        char[] chars1 = new char[list.size()];
//        Arrays.sort(chars1);

    }
//  牛客检查不能通过
//    public int FirstNotRepeatingChar(String str) {
//        if (str == null || str.length() == 0) return 0;
//        String[] strings = str.split("");
//        Map<String, Integer> treeMap = new TreeMap<>();
//        for (int i = 0; i < strings.length; i++)
//            treeMap.put(String.valueOf(strings[i]), treeMap.containsKey(strings[i]) ? treeMap.get(strings[i]) + 1 : 1);
//        int pos = 0;
//        for ( ; pos < strings.length; pos++) {
//            if (treeMap.get(strings[pos]) == 1)
//                break;
//        }
//        return pos;
//    }
}
