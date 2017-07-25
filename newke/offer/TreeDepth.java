package offer;

/**
 * Created by Xulong on 2017/3/24.
 */
public class TreeDepth {

    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        else return max(TreeDepth(root.left), TreeDepth(root.right)) + 1;

    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }
//
//    public int getDepth(TreeNode node) {
//        if (node == null) return 0;
//        else return max(getDepth(node.left), getDepth(node.right)) + 1;
//    }



}
