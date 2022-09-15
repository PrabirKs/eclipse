package recursionKK;

public class RmvAllAdjctDuplctInStrng {

	public static void main(String[] args) {
//		String str1 = "geeksforgeeg";
//	    System.out.println(remove(str1));
//	 
//	    String str2 = "azxxxzy";
//	    System.out.println(remove(str2));
//	 
//	    String str3 = "caaabbbaac";
//	    System.out.println(remove(str3));
//	    
	    String s = "azxxxzxxtootxxxzzzy" ;
	    String s2 = "azbbzacca" ;
//		String temp = s ;
//		String ans = "";
//		
//		while(ans.length()!=temp.length()) {
//			ans = temp ;
//			temp = Remove("",temp);
//			//System.out.println("i=" + temp);
//
//		}
//		System.out.println(temp);
	    
	  /* String temp = s ;
	    String ans = "" ;
	    while(ans.length()!=temp.length()) {
	    	ans = temp ;
	    	temp = rmv(temp) ;
	    	System.out.println(temp);
	    }
        System.out.println(temp);   */
	    
	   // System.out.println(rmvdplct(s));
	    System.out.println(rmv("azxxxzxxxzzzyy"));
	 
	    
	    
	    
	}

	  static String rmv(String s ) {
		  if(s.length()==1) {
			  return s ;
		  }
		  
		  char ch = s.charAt(0);
		  
		  if(ch == s.charAt(1)) {
			  int i = 0 ;
			  while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
				  i++;
			  }
			if(i==s.length()-1) return "" ;
			else
			return  rmv(s.substring(i+1)) ;
		  }
		  else {
			 return s.charAt(0) + rmv(s.substring(1)) ; 
		  }
	  } 
//this functoin is just work fine for removing consecutive 2 same letter , when it found is just goes to 2 
	  //index before(means) removing .. after that adding the next s[j] at updated i
	  static String rmvdplct(String s) {   //
		  char stack[] = new char[s.length()] ;
		  int i = 0 ;
		  
		  for(int j = 0 ;  j < s.length() ; j++) {
			  char crnt_char = s.charAt(j) ;
			  
			  if(i > 0 && stack[i-1] == crnt_char) {
				   i-- ;
			  }else {
				   stack[i] = crnt_char ;
				   i++ ;
			  }
		  }
		  return new String(stack,0,i) ;
	  }
	  
	  
	     
	  static String Remove(String p , String s){
	      if(s.length()==1 || s.length()==0){
	       // System.out.print(p + s.charAt(0)) ;
	    	  if(s.length()==1)
	        return p+s.charAt(0);
	    	  else 
	    		  return p ;
	        }
	      char ch0 = s.charAt(0) ;
	      char ch1 = s.charAt(1) ;
	      if(ch0!=ch1){
	       return Remove(p+ch0,s.substring(1));  //assnasaaajfa"
	      }
	      else{
	    	  int i = 0 ;
	    	  while((i<s.length()-1) && s.charAt(i) == s.charAt(i+1)) { 
	    		  i++;
	    		  } 
	       return Remove(p,s.substring(i+1)) ;
	      }
	       
	    }  
	  
	
	 	  
	  
	  
	  
	  
	  

		 // Recursively removes adjacent
		  //  duplicates from str and returns
		  // new string. last_removed is a
		  // pointer to last_removed character
		  static String removeUtil(String str, char last_removed)
		  {
		     
		    // If length of string is 1 or 0
		    if (str.length() == 0 || str.length() == 1)
		      return str;
		 
		    // Remove leftmost same characters
		    // and recur for remaining 
		    // string
		    if (str.charAt(0) == str.charAt(1))
		    {
		      last_removed = str.charAt(0);
		      while (str.length() > 1 && str.charAt(0) == str.charAt(1)) {
		        str = str.substring(1, str.length());
		      }
		      str = str.substring(1, str.length());
		      
		      return removeUtil(str, last_removed);
		    }
		 
		    // At this point, the first
		    // character is definitely different 
		    // from its adjacent. Ignore first
		    // character and recursively 
		    // remove characters from remaining string
		    String rem_str = removeUtil(str.substring(1,str.length()), last_removed);
		 
		    // Check if the first character of
		    // the rem_string matches with 
		    // the first character of the original string
		    if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0))
		    {
		      last_removed = str.charAt(0);
		       
		      // Remove first character
		      return rem_str.substring(1,rem_str.length());
		    }
		 
		    // If remaining string becomes
		    // empty and last removed character
		    // is same as first character of
		    // original string. This is needed
		    // for a string like "acbbcddc"
		    if (rem_str.length() == 0 && last_removed == str.charAt(0))
		      return rem_str;
		 
		    // If the two first characters
		    // of str and rem_str don't match, 
		    // append first character of str
		    // before the first character of
		    // rem_str
		    return (str.charAt(0) + rem_str);
		  }
		 
		  static String remove(String str) 
		  {
		    char last_removed = '\0';
		    return removeUtil(str, last_removed);      
		  }
		 
		  
		  
	  
	  
	  
}
