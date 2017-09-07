package newke.offer;

import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;

/**
 * Created by Xulong on 2017/4/25.
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class TreePathSum {
    private class Node {
        int val;
        Node right;
        Node left;
    }

//    java.lang.NullPointerException  为使用new分配空间
    public ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();
    public ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(Node root, int target) {
//        if (root == null) return null;
///*        []*/ 你的输出为: null
        if (root == null) return arrayLists;
        target = target - root.val;
        list.add(root.val);
        if (root.left == null && root.right == null && target == 0) {
            arrayLists.add(new ArrayList(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
//        list.remove(root);
        list.remove(list.size()-1);
        return arrayLists;
    }
}
