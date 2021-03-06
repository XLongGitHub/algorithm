package newke.offer;

import java.util.ArrayList;



/**
 * Created by Xulong on 2017/4/17.
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class FindPath {
    //二叉树的所有路径
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    //任一条路径
    private ArrayList<Integer> list = new ArrayList<Integer>();

    private class Node {
        int val;
        Node right;
        Node left;
    }

    public ArrayList<ArrayList<Integer>> FindPath(Node root,int target) {
        if(root == null) return listAll;
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            listAll.add(new ArrayList<Integer>(list));
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);
        return listAll;
    }
}
