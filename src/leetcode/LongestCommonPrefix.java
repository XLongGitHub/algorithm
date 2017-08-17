package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs = {"c", "c"};
        String string = lcp.longestCommonPrefix(strs);
        System.out.println(string);
    }

    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs.length == 0) return prefix;
        prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = commonPreix(prefix, strs[i]);
        }
        return prefix;
    }

    public String commonPreix(String str1, String str2) {
        int len = str1.length() > str2.length() ? str2.length() : str1.length();
        int pos = 0;
        for (; pos < len; pos++) {
            if (str1.charAt(pos) != str2.charAt(pos))
                break;
        }
//        return str1.substring(0, (pos - 1) > 0 ? (pos - 1) : 0);
        return str1.substring(0, pos);  //offset  = end - start
    }
}
