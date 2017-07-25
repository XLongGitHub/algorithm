package offer;

/**
 * Created by Xulong on 2017/4/2.
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class VerifySquenceOfBST {

    public static void main(String[] args) {
        VerifySquenceOfBST vs = new VerifySquenceOfBST();
//        int [] sqeuence = {1};
//        int [] sqeuence = {4,8,6,12,16,14,10};
//        int [] sqeuence = {1,2,3,4,5};
        int [] sqeuence = {};

        System.out.println(vs.VerifySquenceOfBST(sqeuence));
    }

    /**
     * 分组排序，递归调用
     * @param sequence
     * @return
     */
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) return false;
        if (isSort(sequence)) return true;
        if (sequence.length == 3 && sequence[0] < sequence[2] && sequence[2] < sequence[1]) {
            return true;
        }
        int end = sequence[sequence.length - 1];
        int pos = 0;
        for ( ; pos < sequence.length; pos++) {
            if (sequence[pos] > end)
                break;
        }
        int[] left = new int[pos];
        int[] right = new int[sequence.length - 1 - pos];

        System.arraycopy(sequence, 0,  left, 0, left.length);
        System.arraycopy(sequence, pos, right, 0, right.length);
        if (!isUP(right, end)) return false;
        boolean l = VerifySquenceOfBST(left);
        boolean r = VerifySquenceOfBST(right);
        return l && r;
    }

    public boolean isSort(int[] arr) {
        if (arr.length == 0) return false;
        if (arr.length == 1) return true;
        boolean sort = false;
        int i = 0;
        for (; i < arr.length-1; i++)
            if (arr[i] < arr[i+1]) break;
        if (i == arr.length - 1) sort = true;

        int j = 0;
        for (; j < arr.length - 1; j++)
            if (arr[j] > arr[j+1]) break;
        if (j == arr.length - 1) sort = true;

        return sort;
    }

    public boolean isUP(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++ )
            if (arr[i] < num) return false;
        return true;
    }
//    public boolean VerifySquenceOfBST(int [] sequence) {
//        if (sequence.length == 0) return false;
//
//        int pos = 0;
//        int endp = sequence.length;
//        int end = sequence[sequence.length - 1];
//        for (; pos < sequence.length; pos++) {
//            if (sequence[pos] > end)
//                break;
//        }
//
//        for (int i = pos; i < sequence.length-1; i++) {
//            if (sequence[i] < end)
//                return false;
//        }
//
//        return true;
//    }
}
