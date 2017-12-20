package leetcode;

public class  TrappingRainWater {

    public int trap(int[] height) {
        int trapWater = 0;
        //降低算法复杂度
        boolean[] isTrapIndex = new boolean[height.length];

        for (int i = 1; i < height.length - 1; i++) {
            if (isTrap(i, height)) isTrapIndex[i] = true;
            //如果相邻的两个位置都能加入水，则它们的最大值相同
            if (isTrapIndex[i - 1] == true && isTrapIndex[i] == true) {
                trapWater += (height[i - 1] - height[i]);
                height[i] = height[i - 1];
                continue;
            } else {
                //一次加满
                while (isTrap(i, height)) {
                    trapWater++;
                    height[i]++;
                }
            }
        }
        return trapWater;
    }

    public boolean isTrap(int pos, int[] height) {
        if (pos <= 0 || pos >= height.length) return false;
        boolean isTrapLeft = false;
        boolean isTrapRight = false;
        for (int i = pos - 1; i >= 0; i--) {
            if (height[i] > height[pos]) {
                isTrapLeft = true;
                break;
            }
        }
        for (int j = pos + 1; j < height.length; j++) {
            if (height[j] > height[pos]) {
                isTrapRight = true;
                break;
            }
        }
        return isTrapLeft && isTrapRight;
    }


    public static void main(String[] args) {
        int[] height = {5, 2, 1, 2, 1, 5};
        TrappingRainWater trw = new TrappingRainWater();
        int h = trw.trap(height);
        System.out.println(h);
    }
}