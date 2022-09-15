package tree;
import java.util.*;
public class ZIgZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static List<List<Integer>> zigzag (TreeNode root){
		if(root == null) return null ;
		
		Queue<TreeNode> q = new LinkedList<>() ;
		List<List<Integer>> ans = new ArrayList<>() ;
		boolean leftToRight = true ;
		
		q.add(root) ;
		while(!q.isEmpty()) {
			
			int size = q.size() ;
			List<Integer> level = new ArrayList<>(size) ;
			for(int i = 0 ; i < size ; i++) {
				TreeNode temp = q.poll() ;
				
				int index = 0 ;
				if(leftToRight)  index = i ;
				else index = size - i - 1 ;
				level.add(index,temp.data);
				
				if(temp.left != null) q.add(temp.left) ;
				if(temp.right != null) q.add(temp.right) ;
			}
			leftToRight = !leftToRight ;  //each time revert the direction
			ans.add(level) ;
		}
		return ans ;
	
	}
	

}
