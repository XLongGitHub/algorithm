package leetcode;

import sun.reflect.generics.tree.Tree;

public class SameTree {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            value = x;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null && q != null) return false;
        if (p != null && q == null) return false;

        if (p.value != q.value) {
            return false;
        } else {
           return isSameTree(p.left, q.left) &&  isSameTree(p.right, q.right);
        }

    }

    public static void main(String[] args) {
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);

        TreeNode q1 = new TreeNode(1);
        TreeNode q2 = new TreeNode(2);
        TreeNode q3 = new TreeNode(3);

        SameTree st = new SameTree();

        p1.left = p2;

        q1.left = null;
        q1.right = q2;

        System.out.println(st.isSameTree(p1, q1));

    }
}
