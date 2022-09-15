package questions;
import java.util.*;
public class Celebrirty {

	public static void main(String[] args) {
		int[][] matrix = {{0,1,1,1},
				          {1,0,1,0},
				          {0,0,0,0},
				          {1,1,1,1}} ;
		checkCelebrity(matrix) ;
		}
    static void checkCelebrity(int[][] matrix) {
    	Stack<Integer> res = new Stack<>();
    	for(int i = 0 ; i < matrix.length ;i++) {
    		res.push(i) ;
    	}
    	while(res.size()>=2) {
    		int person1 = res.pop();
    		int person2 = res.pop();
    		if(matrix[person1][person2]==1) { //if person1 knows person 2 ,then p1 is not a celebrity ,but p2 might be
    			res.push(person2) ;
    		}else {                           //if person1 dont knows p2 then , p2 is not celebrity , but p1 might be so push
    			res.push(person1) ;
    		}
    	}
    	int maybecelbrty = res.pop() ;
    	//now we have the one peroson in the stack who might be the celebrity
    	//and just have to check that , whether everyone knows him or not . and he knows NOone or not
    	
    	for(int i = 0 ; i < matrix.length ; i++) {
    		if(i != maybecelbrty) {  // means knowing itself is no sense so , just skips it . 
    			// check for of he knows anyone or anyone dont know him .
    			if(matrix[maybecelbrty][i] == 1 || matrix[i][maybecelbrty] == 0) { 
    			System.out.println("no one is celebrity .");
    			return ;
    			}
    		 }
    	 }
    	System.out.println(maybecelbrty + " is the celibrity");
			
	  }

}
