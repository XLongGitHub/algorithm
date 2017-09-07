package algorithm4.chpterOne;

import java.util.Arrays;

/**
 * 查找最近的一对
 */
public class ClosestTwoNum {
    public static void main(String[] args) {
        ClosestTwoNum ctn = new ClosestTwoNum();
        int[] ints = {54, 8, 15, 12, 6, 4, 6, 3, 1, 6, 4, 6, 1, 6, 4, 9, 31, 4, 6, 4, 6, 64, 4, 5, 4, 5, 54};
        ctn.findMinTwo(ints);
    }

    public void findMinTwo(int[] ints) {
        Arrays.sort(ints);
        int first = ints[0];
        int second = ints[1];
        int min = second - first;

        for (int i = 1; i < ints.length; i++) {
            if (ints[i] - ints[i - 1] < min) {
                first = ints[i - 1];
                second = ints[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
    }
}
