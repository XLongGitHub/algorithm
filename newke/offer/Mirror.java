package newke.offer;

/**
 * Created by Xulong on 2017/3/24.
 * 二叉树的镜像
 */

public class Mirror {
    public static void main(String[] args) {

    }

    public void Mirror(TreeNode root) {
        if (root == null) return;

        //直接交换左右子节点的值

        TreeNode temp_left = root.left;
        TreeNode temp_right = root.right;

        root.left = temp_right;
        root.right = temp_left;

        Mirror(root.left);
        Mirror(root.right);

        //创建一棵树，跟随遍历，反向添加子节点
//        TreeNode root1 = new TreeNode(root.val);
//
//        if (root.left != null) {
//            Mirror(root.left);
//        }
//
//        if (root.right != null) {
//            Mirror(root.right);
//        }
//
//
//        root = root1;
    }
}
