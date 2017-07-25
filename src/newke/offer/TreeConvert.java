package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xulong on 2017/4/25.
 */
public class TreeConvert {
    //static 关键字倒置数据出现不明错误
    private  List<TreeNode> list = new ArrayList<TreeNode>();
    public TreeNode Convert(TreeNode pRootOfTree) {
         subConvert(pRootOfTree);

        if(list.size() == 0) return pRootOfTree; //防止越界

         for (int i = 0; i < list.size() -1; i++) {
             TreeNode pre = list.get(i);
             TreeNode then = list.get(i+1);
             pre.right = then;
             then.left = pre;
         }
         return list.get(0);
    }

    public  void subConvert(TreeNode treeNode) {
        if (treeNode == null) return ;
        subConvert(treeNode.left);
        list.add(treeNode);
        subConvert(treeNode.right);
    }
}
