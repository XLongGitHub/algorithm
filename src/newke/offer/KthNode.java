package newke.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Xulong on 2017/4/19.
 * 给定一颗二叉搜索树，请找出其中的第k大的结点。
 * 例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
 */

/**
 * 先将树中的节点用先序遍历，按照从小到大的顺序装入容器，然后再根据对应值从该容器中取得对应节点
 */
public class KthNode {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (k==0) return null;
        List<TreeNode> listp = new ArrayList<TreeNode>();
        List listv = new ArrayList();
        dfs(pRoot, listp, listv);
        int[] ints = new int[listv.size()];
        for (int i = 0; i < ints.length; i++)
            ints[i] = (int)listv.get(i);
        Arrays.sort(ints);
        if (ints.length < k) return null;  //边界验证
        int num = ints[k-1];
        for (int i = 0; i < listp.size(); i++) {
            if (listp.get(i).val == num)
                return listp.get(i);
        }
        return null;
    }
    private static void dfs(TreeNode p, List listp, List listv) {
        if (p == null) return;
        dfs(p.left, listp, listv);
        listp.add(p);
        listv.add(p.val);
        dfs(p.right, listp, listv);
    }

//    private static TreeNode dfsd(TreeNode p, int num) {
//        if (p == null) return null;
//        if (num == p.val) return p;
//        if (p.left != null) return dfsd(p.left, num);
//        if (p.right != null) return dfsd(p.right, num);
//        return null;
//    }


}
