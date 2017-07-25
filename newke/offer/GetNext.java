package newke.offer;

import sun.reflect.generics.tree.Tree;

/**
 * Created by Xulong on 2017/4/4.
 */

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class GetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;
        //右节点本身或右节点得的左子树
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while( null != node.left) {
                node = node.left;
            }
            return node;
        }
        //父节点
        while (pNode.next != null) {
            if (pNode.next.left == pNode) return pNode.next;
            pNode = pNode.next;
        }
        return null;
    }

//    public String traversal(TreeLinkNode pNode) {
//        String str = "";
//        if (pNode == null) return str;
//        traversal(pNode.left);
//        str += pNode.val;
//        traversal(pNode.right);
//        return str;
//
//    }
}
