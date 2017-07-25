//package newke.offer;
//
//import java.util.ArrayList;
//
///**
// * Created by Xulong on 2017/3/24.
// * 从上往下打印二叉树
// */
//public class PrintFromTopToBottom {
//
//    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//        ArrayList<TreeNode> al = new ArrayList();
//        ArrayList<Integer> alvals = new ArrayList<>();
//        if (root == null) return alvals;
//        al.add(root);
//        al =  Print( al, 0);
//
//        for (int i=0; i < al.size(); i++)
//            alvals.add(al.get(i).val);
//        return alvals;
//
//    }
//
//    /**
//     * 每一层的子节点添加完成后，在根据索引进行下一层的添加，参照广度优先遍历
//     * @param al
//     * @param pos
//     * @return
//     */
//    public ArrayList<TreeNode> Print( ArrayList al, int pos) {
//        TreeNode root = (TreeNode) al.get(pos);
//        if (root == null) return null;
//        if (root.left != null) al.add(root.left);
//        if (root.right != null) al.add(root.right);
//
//        if ( ++pos < al.size() ) Print(al , pos);
//        return  al;
//    }
//}
