package tree;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data = data ;
		this.left = null ;
		this.right = null ;
	}
}	
public class Tree {
	TreeNode root ;
    
    public static void main(String[] args) {
		Tree tree = new Tree() ;
		
		tree.root = new TreeNode(1) ;
		
		tree.root.left = new TreeNode(2) ;
		tree.root.right = new TreeNode(3) ;
		
		tree.root.left.left = new TreeNode(4) ;
		tree.root.left.right = new TreeNode(5) ;
		
		tree.root.right.left = new TreeNode(6) ;
		
		tree.root.right.left.right = new TreeNode(7) ;
		
		
		print(tree.root) ;
		
	}
    
    static void print(TreeNode root) {
    	if(root == null) {
    		return ;
    	}
    	System.out.print(root.data + " ");
    	print(root.left) ;
    	print(root.right) ;
    }
}
