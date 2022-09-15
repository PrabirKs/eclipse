package recursionKK;

import java.util.ArrayList;

public class SubString {
	  static ArrayList<String> list =  new ArrayList<>() ;

	     public static void main(String[] args) {
		String s = "abc" ;
		// Substrings are [a,ab,ac,b,bc,b,abc, ]
		//so basically at each sub set it is just ignoring some character and adding some character, like [a] , ignore b , c
		//in [bc] ignore a
		//so we just take a empty string ,create two recursive call, one by adding the first char and calling to the next substring,
		//and another not adding the first char , ignoring and calling to the next substring
		
		//generatesubstring("",s) ;
		
		
		generatesubstring("",s);
		System.out.println(list);
		
		
//		ArrayList<String> ans =  new ArrayList<>() ;
//		System.out.println(gneratesubstring("",s,ans));
//		System.out.println(gneratesubstring("",s));
//		
//		char ch = 'a' ;
//		
//		System.out.println((char)(ch+1));
		
	}
     
     static void generatesubstring(String p , String s) {
    	 if(s.isEmpty()) {
    		 list.add(p) ;  //globally declared list and adding inside it
    		 System.out.println(p);
    		 return ;
    	 }
    	 System.out.println("p = [" + p + "] s = [" + s +"]");
    	 generatesubstring(p + s.charAt(0) ,s.substring(1)) ;  //just adding the first char and move to the next 
    	 
    	 
    	 generatesubstring(p,s.substring(1)) ; // here not adding just skipping the first char and moving to the next char
     }
     
  // here the same process, but here we are passing, arraylist at each step 
     static ArrayList<String> gneratesubstring4(String p , String s,ArrayList<String> ans) {
    	 if(s.isEmpty()) {
    		ans.add(p) ;
    		 return ans ;
    	 }
    	   gneratesubstring4(p + s.charAt(0) ,s.substring(1),ans) ;
    	 
    	   gneratesubstring4(p,s.substring(1),ans);	
    	   return ans ;
    	 
     }
     
     static void gnratesubstring2(String p , String s) {
    	 if(s.isEmpty()) {
    		System.out.println(p);
    		 return ;
    	 }
    	   gnratesubstring2(p + s.charAt(0) ,s.substring(1)) ;
    	 
    	   gnratesubstring2(p,s.substring(1));	
    	   
    	 
     }
     
    //here we are not passing arraylist inside it , rather than we are just declaring a new arraylist at each function call
     //inside the function, and create two list which will store all the value return from the left part and right part of
     // the recursion, 
     static ArrayList<String> gneratesubstring3(String p , String s) {
    	 if(s.isEmpty()) {
    		 ArrayList<String> list = new ArrayList<>();
    		 list.add(p) ;     //  at each call, when the string became,null it added the processed (p) string into a lsit 
    		                   //and return it to eithe left or right acc to the calls
            return list ;
    	 }
    	  ArrayList<String> left =  gneratesubstring3(p + s.charAt(0) ,s.substring(1)) ; //left part add all the retrn value
    	  //with adding the first char and then move on
    	 
    	  ArrayList<String> right = gneratesubstring3(p,s.substring(1));	// right part just skipp the first char and move on .
    	  left.addAll(right) ;  //now we just consider either left or right, lets consider left and add all the right valuee
    	                        //and now at each call left contains the left subset and write subset and return it .
    	   return left ;
    	 
     }


}
