package newke.offer;

/**
 * Created by Xulong on 2017/3/24.
 */
public class isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot) {
        int [] a = {1};
        if (pRoot.left == null && pRoot.right != null) return false;
        if (pRoot.left != null && pRoot.right == null) return false;
        if (pRoot.left.val != pRoot.right.val ) return false;
        if (pRoot.left != null)isSymmetrical(pRoot.left);
        if (pRoot.right != null)isSymmetrical(pRoot.right);
        return true;
    }
}
