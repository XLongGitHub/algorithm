package algorithm4.chpterOne;

import java.util.Arrays;

/**
 * 最远的两个数字
 */
public class FarestTwoNum {
    public static void main(String[] args) {
        FarestTwoNum ftn = new FarestTwoNum();
        int[] ints = {54, 8, 15, 12, 6, 4,-32, 6, 3, 1, 6, 4, 6, 1, 6, 4, 9, 31, 4, 6, 4, 6, 64, 4, 5, 4, 5, 54};
        ftn.findMaxTwo(ints);
    }

    /**
     * @param ints
     */
    public void findMaxTwo(int[] ints) {
        int min = ints[0];
        int max = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (min > ints[i]) min = ints[i];
            if (max < ints[i]) max = ints[i];
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(max - min);
    }
}
