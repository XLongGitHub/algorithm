package offer;

/**
 * Created by Xulong on 2017/4/2.
 */
public class LeftRotateString {
    public static void main(String[] args) {
        LeftRotateString lr = new LeftRotateString();
        String str = "abcdefg";
        System.out.println(lr.LeftRotateString(str, 2));
    }

    public String LeftRotateString(String str,int n) {
        n = n % str.length();
        char[] chars = str.toCharArray();
        char[] chars1 = new char[chars.length];

        for (int i = 0; i < str.length() - n; i++) {
            chars1[i] = chars[i+n];
        }

        for (int i = 0; i < n; i++) {
            chars1[str.length()- n  +i] = chars[i];
        }

        return new String(chars1);
    }
}
