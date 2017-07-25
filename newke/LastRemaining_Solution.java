package offer;

/**
 * Created by Xulong on 2017/4/2.
 */
public class LastRemaining_Solution {

    public static void main(String[] arags) {
        LastRemaining_Solution lr = new LastRemaining_Solution();
        System.out.println(lr.LastRemaining_Solution(5, 3));
//        System.out.println(lr.LastRemaining_Solution(3, 1));
    }

    public int LastRemaining_Solution(int n, int m) {
        int[] que = new int[n];
        int count = n;
//        for (int i = 0; i < que.length; i++)
//            que[i] = 0;
        int pos = 0;
        while ( count != 1) {
            int m1 = m;
            for (int i = 0; m1 > 0; ) {
                pos++;
                if (que[pos % (n-1)] == 0) {
                    m1--;
                }

                i++;
            }
            que[pos] = 1;
            count--;
        }
        return pos;
    }

    /**
     * 导致算法复杂度过大，因此使用count，直接进行计数
     * @param a
     * @return
     */
    public boolean onlyOne(int[] a) {
        int count = 0;
        for (Integer i : a)
            if (i == 0) {
            if (++count == 2) return false;
            }
        return count == 1;
    }
}
