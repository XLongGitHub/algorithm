package leetcode;

public class ImplementstrStr {
    
    public static void main(String[] args) {
        ImplementstrStr is = new ImplementstrStr();
        String haystack = "";
        String needle = "";
        int index = is.strStr(haystack, needle);
        System.out.println(index);
    }

    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len1 < len2) return -1;
        if (len2 == 0) return 0;

        for (int i = 0; i < len1 -len2 + 1; i++) {
            for (int j = 0; j < len2; j++) {
                if (haystack.charAt(i) == needle.charAt(j) && j == len2 - 1) {
                    return i - j;
                } else if (haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    continue;
//                    break;
                } else {
                    i = i - j;  //匹配失败，复位
                    break;
                }
            }
        }
        return - 1;
    }
}