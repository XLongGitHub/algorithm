package leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length <= 1) return 0;
        int maxArea = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int tmp = min(height[i], height[j]);
//                maxArea = max(maxArea, tmp * (j - i));
//            }
//        }
        int start = 0, end = height.length - 1;
        while (start < end) {
            maxArea = max(maxArea, min(height[start], height[end]) * (end - start));
            if (height[start] < height[end])
                start++;
            else end--;
        }
        return maxArea;
    }

    public int max(int a, int b) {
        return a >= b ? a : b;
    }

    public int min(int a, int b) {
        return a >= b ? b : a;
    }
}
