package recursionKK;
import java.util.*;
class pair{
	char ch ;
	int freq ;
	
	pair(char element , int frequency){
		this.ch = element ;
		this.freq = frequency ;
	}
}
public class RmvDplcts_I {

	public static void main(String[] args) {
		String t = "caabcccbaaabad" ;
	    String temp = t ;
//	    String ans = "" ;
//	    while(ans.length()!=temp.length()) {
//	    	ans = temp ;
//	    	temp = removeDuplicates(temp ,3);
//	    	//System.out.println(temp);
//	    }
//		temp = removeDuplicates(temp ,3);
//	    System.out.println(temp);
	    
	    temp = removeDplcts(temp ,3);
	    System.out.println(temp);


	}
	
	
	
	
	// using stack,  and adding pair with the char and its frequency
 public static String removeDplcts(String s, int k) {
		 Stack<pair> stack = new Stack<pair>() ;
	
		 for(int i = 0 ; i < s.length() ; i ++) {

			 int freq = 0 ;
			if(stack.isEmpty() || s.charAt(i)!= stack.lastElement().ch) {
				stack.add(new pair(s.charAt(i),1)) ;   //in case unequal match just add with frq 1
			}
			else {
				 freq = stack.lastElement().freq ;         // get the freq 
				 stack.pop() ;                             // remove that
				 stack.add(new pair(s.charAt(i),freq+1)) ; //add it again with freq++ ;
		    	 }
			if(stack.peek().freq==k) {    // when freq==k , pop it completely
				stack.pop() ;			
			 }
		 }
		 //now the stack has all the non duplicate value, as required
		 String ans = "";                  
		 while(!stack.isEmpty()) {
			  
			 	pair cur  =	stack.pop() ;  // get the top value            //pop it
			 	while(cur.freq-- > 0) {     // it has freq<k    so it is here , so add it as many no it is in stack by
			 		ans = cur.ch + ans ;   // reducing its freq 3,2,... untill 0 . concat the string with the char
			 	}
			 }
		 return ans ;  // return it
	}
 
 
 
 
 
 
 
 //at one go it just remove all the consecutive duplicates, not (updated string's dupliate)
 //so have to pass the string again ,
 //this method is working fine , but time complexity is more ,in case of high length string, so stack method is used
	 public static String removeDuplicates(String s, int k) {
         char stack[] = new char[s.length()] ;
		  int i = 0 ;
		  int j = 0 ;            //declard outside to update its value inside the loop , to the next of duplicate group(k no of) 
		  for(j = 0 ;  j < s.length() ; j++) {
			  char crnt_char = s.charAt(j) ;
			  
			  if(i > 0 && stack[i-1] == crnt_char) { //means alreday 2 letters are same just k-2 letter left
                  if(k!=2){
                  int ktrack= 0 ; 
                      int jj = j ;
                  while(jj<s.length()-1 &&  ktrack != k-2 && s.charAt(jj)==s.charAt(jj+1)){
                      jj++ ; ktrack++ ;  // jj is now at the last kth duplicate letter
                  }
                      if(ktrack==k-2){
                          i-- ;                // update i to the before index
                          j = jj ;             // updating the j to the next after kth grp

                      }else {   //incase of k no of consecutive duplicates are not present .
   					   stack[i]  = crnt_char ;  // add inside it . 
					   i++ ;     // update i 
				     }
                      continue ; //then go to the loop
               }
				   i-- ;  //in case of k == 2 , just i-- , already checked at the begining
			  }else {
				   stack[i] = crnt_char ;
				   i++ ;
			  }
		  }
		  return new String(stack,0,i) ;

    }
	 
	
 }


