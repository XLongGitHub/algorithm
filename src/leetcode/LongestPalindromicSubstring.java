package leetcode;

public class LongestPalindromicSubstring {
    private int maxLen;  //回文串长度
    private int low;  //起点
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        for (int i = 0; i < s.length() - 1; i++) {
            maxString(s, i, i);
            maxString(s, i, i + 1);
        }
        return s.substring(low, maxLen + low);
    }

    public void maxString(String str, int lo, int hi) {
        while ( (lo >= 0) && (hi <= str.length() - 1) && (lo <= hi) && str.charAt(lo) == str.charAt(hi)) {
            lo--; //向低位移动
            hi++; //向高位移动
        }
        int len = hi - lo - 1;
        if (len > maxLen) {
            low = lo + 1;
            maxLen = len;
        }
    }

    public static void main(String[] args) {
        String str = "abcdcbdaaaaaaaaaaaaaaaaaaaa";
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String s = lps.longestPalindrome(str);
        System.out.println(s);
    }

}
