package leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int i = 1;
        for ( ; i < 10; i++) {
            if (Math.pow(10, i) > x)
                break;
        }
        int z = x;
        int y = 0;
        for (int j = 0; j < i; j++) {
            y = y*10 + x % 10;
            x /= 10;
        }
        return (z == y);
    }


}
