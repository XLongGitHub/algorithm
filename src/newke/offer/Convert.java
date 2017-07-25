package offer;

/**
 * Created by Xulong on 2017/3/31.
 */
public class Convert {

    public static void main(String[] args) {

    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        return null;

    }

    public void pre_traversal(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return;
        traversal(pRootOfTree);
        pre_traversal(pRootOfTree.left);
        pre_traversal(pRootOfTree.right);
    }

    public TreeNode traversal(TreeNode pRootOfTree) {

        if (pRootOfTree.left != null) {
            pRootOfTree.left.right = pRootOfTree;
        }

        if (pRootOfTree.right != null) {
            pRootOfTree.right.left = pRootOfTree;
        }
        return null;

    }
}
