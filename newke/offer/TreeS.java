package newke.offer;

class TreeNode {
    //int val = 0;
	String val = null;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(String val) {
        this.val = val;

    }

}

public class TreeS {
    /*public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        
    }
    */
	
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode("A");
		TreeNode tempb = new TreeNode("B");
		TreeNode tempc = new TreeNode("C");
		TreeNode tempd = new TreeNode("D");
		TreeNode tempe = new TreeNode("E");
		TreeNode tempf = new TreeNode("F");
		TreeNode tempg = new TreeNode("G");
		
		root1.left = tempc;
		tempc.left = tempe;
		tempc.right = tempg;
		root1.right = tempb;
		tempb.right = tempd;
		tempd.right = tempf;
		printTree(root1);
		System.out.println(traverseTree(root1));
	}
	
	public static void printTree(TreeNode root) {
		if (root != null) {
			System.out.println(root.val);
			if (root.left != null)
				printTree(root.left);
			if (root.right != null) 
				printTree(root.right);
		}
	}
	
    public static String traverseTree(TreeNode root) {
    	if(root !=  null)     {
            String tree =""+root.val;
        	if(root.left != null) {
        		 tree = tree+traverseTree(root.left);
        	}
        	if(root.right != null) {
        	 tree = tree+traverseTree(root.right);
        	}
        	return tree;
        } 
    	return "";    
    } 
    
}