package offer;

/**
 * Created by Xulong on 2017/4/4.
 */
public class IsBalanced {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
//        if (Math.abs(depthLeft(root) - depthRight(root)) >= 2) {
//            return false;
//        }
        if (Math.abs(getDepth(root.left) - getDepth(root.right)) >= 2)
            return false;

        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }


    public int getDepth(TreeNode node) {
        if (node == null) return 0;
        return max(getDepth(node.left), getDepth(node.right)) + 1;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }
    /**
     * 不适用于左右摇摆型
     * @param node
     * @return
     */
    public int depthLeft(TreeNode node) {
        if (node == null) return 0;
        else return depthLeft(node.left) + 1;
    }
    public int depthRight(TreeNode node) {
        if (node == null) return 0;
        else return depthRight(node.right) + 1;
    }
}
