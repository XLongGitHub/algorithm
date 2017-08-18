package leetcode;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        if (isBadVersion(n)) {
            return n;
        } else {
            if (isBadVersion(n / 2)) {
                return firstBadVersion(n / 2);
            } else if (isBadVersion( n * 3 / 4)) {
                return firstBadVersion(n * 3 / 4);
            } else {
                return firstBadVersion(n / 4);
            }
        }
    }

    public boolean isBadVersion(int version) {
        return true;
    }
}
