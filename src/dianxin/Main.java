package dianxin;

import java.util.*;

/**
 * 字符串排序
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        List<Character> list1 = new LinkedList();
        List<Character> list2 = new LinkedList();
        Map map = new HashMap();
        /**
         * 分离字母，符号
          */
        for (int i = 0; i < chars.length; i++) {
            if (!isChar(chars[i])) {
                list2.add(chars[i]);
                map.put(chars[i], i); //记录位置
                continue;
            }
            list1.add(chars[i]);
        }
        Object[] objects = list1.toArray();
        char[] chars1 = new char[objects.length];
        for (int i = 0; i <chars1.length; i++) {
            chars1[i] = (char) objects[i];
        }
//        Arrays.sort(chars1);
//        int pos = 0;
        int len = chars1.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if ( compare(chars1[i], chars1[j]) > 0) {
                    char tmp = chars1[i];
                    chars1[i] = chars1[j];
                    chars1[j] = tmp;
                }
            }
        }
//        System.out.println(Arrays.toString(chars1));

        List list = new ArrayList();
        char[] chars2 = new char[str.length()];
        for (int i = 0; i < chars2.length; i++) {
            chars2[i] = '`';
        }
        for (int i = 0; i < list2.size(); i++) {
            char tmp = list2.get(i);
            int index = (int) map.get(tmp);
            chars2[index] = tmp;
        }
        int pos1 = 0;
        for (int i = 0; i < chars2.length; i++) {
            if (chars2[i] == '`') chars2[i] = chars1[pos1++];
        }

        String string = new String(chars2);
        System.out.println(string);


    }

    public static boolean isChar(char ch) {
        if ('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z')
            return true;
        return false;
    }

    public static int compare(char ch1, char ch2) {
        if (isSmall(ch1) && isSmall(ch2))
            return ch1 - ch2;
        if (isSmall(ch1) && !isSmall(ch2))
            return ch1 - ch2 - 48;
        if (!isSmall(ch1) && !isSmall(ch2))
            return ch1 - ch2;
        if (!isSmall(ch1) && isSmall(ch2))
            return ch1 - ch2 + 48;
        return 0;
    }

    public static boolean isSmall(char ch) {
        if('a' <= ch && ch <= 'z') return true;
        return false;
    }

}
