package leetcode;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) return 0.0;
        int pos1 = 0;
        int pos2 = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        while (true) {

            if ((len1 + len2) % 2 == 1) {
                if (nums1[pos1] <= nums2[pos2]) {
                    pos1++;
                    if ((pos1 + pos2) == (len1 + len2) / 2) {
                        return nums1[pos1];
                    }

                } else {
                    pos2++;
                    if ((pos1 + pos2) == (len1 + len2) / 2) {
                        return nums2[pos2];
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
        double meidan = m.findMedianSortedArrays(nums1, nums2);
        System.out.println(meidan);
    }
}
