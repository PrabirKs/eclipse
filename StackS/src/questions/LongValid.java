package questions;

import java.util.*;

public class LongValid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//String s=sc.next();
	 String s="()(()))(())())()()" ;
	 	
	 int u=check(s);
	System.out.println(u);
	}
	    public  static int check (String s) {
	        Stack<Integer> st =new Stack<Integer>();
	        
	      
	        for(int i=0;i<s.length();i++){
	       
	           if(!st.isEmpty() && s.charAt(i)==')' && s.charAt(st.peek())=='(') {
	        	        //System.out.print("-"+st.peek()+" ");
	            		st.pop() ;                                                   //( ) match found and pop the valid "(
	            	}
	           else {
	        	   st.push(i);                                                    // else push the pair , whtether it is '('     or   ")"
	        	 // System.out.print(i+" ");
	           }
	           //now the stack has only the elements of the oddly placed bracket in the list , so now take a inedex= -1 to 
	           // check the first length of the valid paranthesis  i.e if ( ( ) ) ) ( ( ) ) )
	           //                                                         0 1 2 3 4 5 6 7 8 9         now 4 is the wrongly placed so the valid paranthesis before that
	           //                                                                                     is 4 - (-1) -1  =  4 , now the second wrongly placed 9
	           //                                                                                                          is 9 - 4 -1= 4
	                                                                            
	        }
	        int max=0; 
	        int index=-1;
	        for(int oddIndex:st) {
	           max=Math.max(max,oddIndex - index -1 );
	           index= oddIndex;
	        }
	        max=Math.max(max, s.length()-index-1);       // lastly check the valid paranthesis after the last odd paranthesis to last length of the string
	        return max;
	    }
	    
}	    
	    
	    //()(()()(()(()()()
	    
	    
	    
	    /* public int longestValidParentheses(String s) {
        int n=s.length();  int result=0;
        Stack<Integer> st= new Stack<Integer>();
        st.push(-1);
        for(int i=0;i<n;i++){
           if(s.charAt(i)=='('){
               st.push(i);
           }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                if(!st.isEmpty()){
                    result=Math.max(result,i-st.peek()) ;
                }
                else{
                    st.push(i);
                }
                    
            }
           
         }
        return result;
    } */
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    /*
	     *  public int longestValidParentheses(String s) {
        Stack<Integer> st= new Stack<Integer>();
        for(int i=0;i<s.length();i++){
            if( s.charAt(i)=='(' )  {
                st.push(i);
            }
            else{
                if(s.charAt(st.peek())=='(' && !st.isEmpty() && s.charAt(i)==')')
                st.pop();
           }
        }  
             int index= -1; 
             int max= 0 ;
            for(int j:st){
              max= Math.max(max,j - index -1);
                  index = j ;
               }
            max= Math.max(max,s.length()-index -1);
        
        return max;
    }
	     */
	     

 
