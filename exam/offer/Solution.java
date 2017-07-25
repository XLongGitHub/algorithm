package offer;

/**
 * Created by Xulong on 2017/3/24.
 * 重建二叉树
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution{
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        if (pre.length == 0) return null;

        TreeNode root = new TreeNode(pre[0]);
        int pos = 0;
        for (int i = 0; i < in.length; i++) {
            pos++;
            if (pre[0] == in[i])
                break;
        }

        int[] pleft = new int[pos - 1];
        int[] pright = new int[in.length - pos];
        int[] left = new int[pos - 1];
        int[] right = new int[in.length - pos];

        //pre
        for (int i = 0;i < pleft.length; i++)
            pleft[i] = pre[i+1];

        for (int j = 0; j < pright.length; j++)
            pright[j] = pre[pos+j];
        //in
        for (int i = 0; i < left.length; i++)
            left[i] = in[i];

        for (int j = 0; j < right.length; j++)
            right[j] = in[j+pos];

        root.left = reConstructBinaryTree(pleft, left);
        root.right = reConstructBinaryTree(pright, right);

        return root;
    }
}