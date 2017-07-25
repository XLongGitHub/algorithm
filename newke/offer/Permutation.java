package newke.offer;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by Xulong on 2017/3/24.
 * 字符串的排列
 */
public class Permutation {

    public static void main(String[] args) {
        Permutation p = new Permutation();
        ArrayList<String> arrayList;
        arrayList = p.Permutation("abc");
        for (String s : arrayList)
            System.out.println(s);
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) return result;       //判断输入是否有效

        char[] chars = str.toCharArray();
        TreeSet<String> temp = new TreeSet<>();  //存放结果
        Permutation(chars, 0, temp);

        result.addAll(temp);
        return result;

    }

    private void  Permutation(char[] chars, int begin, TreeSet<String> result) {
        if ( begin < 0 || begin > chars.length-1)
            return;

        if (begin == chars.length - 1)
            result.add(String.valueOf(chars));
        else {
            for (int i = begin; i < chars.length; i++) {
                swap(chars, begin, i);

                Permutation(chars, begin + 1, result);

                swap(chars, begin, i);
            }
        }

    }

    private void swap(char[] chars, int a, int b) {
        char ch = chars[a];
        chars[a] = chars[b];
        chars[b] = ch;
    }

}
