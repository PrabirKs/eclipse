package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class pair{
	TreeNode node ;
	int indx ;
	public pair(TreeNode node,int indx) {
		this.node = node ;
		this.indx = indx ;
	}
}
public class Traverse {

	public static void main(String[] args) {
		Tree tree =  new Tree();

	}
    
	static void traverse(TreeNode root) {
		Stack<pair> st =  new Stack<>();  //creaeted a stck of pair type 
		st.push(new pair(root,1)) ;  //push the rooot into it
		//now we created 3 list to store the traverasl result
		List<Integer> preorder = new ArrayList<>() ;
		List<Integer> inorder = new ArrayList<>() ;
		List<Integer> postorder = new ArrayList<>() ;
		
		while(!st.isEmpty()) {
			//popping out the top pair from the list
			pair temp = st.pop() ;
			int track = temp.indx ;
			
			if(track == 1) {
				preorder.add(temp.node.data) ;
				temp.indx++ ;   //updating the indx 1 -> 2
				st.push(temp) ;
				
				if(temp.node.left !=  null) {
					st.add(new pair(temp.node.left,1)) ;
				}
			}else if(track == 2) {
				inorder.add(temp.node.data) ;
				temp.indx++ ;  //updating the indx 2 -> 3
				st.push(temp) ;
				
				if(temp.node.right !=  null) {
					st.add(new pair(temp.node.right,1)) ;
				}
			}else {
				postorder.add(temp.node.data) ;
			}
		}
		
		
	}
}
