package recursionKK;

public class Pattern {
     public static void main(String[] args) {
		//pattern(5) ;
		
		pattern3(3,0) ;
	}
     
     static void pattern(int n ) {
    	 if(n==0) return ;
    	 
    	 for(int i = 0 ; i < n ; i ++) 
    		 System.out.print("* ");

             System.out.println();
    	 
    	 pattern(n-1) ;
    	 
     }
     
    static void pattern1(int r,int c) {
    	if(r==0) return ;
    	
    	if(c<r) {
    		System.out.print("# ");
    		pattern1(r,c+1) ;
    		return ;
    	}
    	System.out.println();
    	c = 0 ;
    	pattern1(r-1,c);
    }
    
    static void pattern2(int r,int c) {
    	if(r==0) return ;
    	
    	if(c<r) {
    	    System.out.print("# ");
    		pattern2(r,c+1) ;
    		
    	}
    	else {
    	System.out.println();
    	pattern2(r-1,0);
    	}
    }
    //just make print after the fun call then straight pattern will output'''''''''''//
    
    static void pattern3(int r,int c) {
    	if(r==0) return ;
    	
    	if(c<r) {
    	   pattern3(r,c+1) ;
    	   System.out.print("# ");
    		
    	}else {
    	pattern3(r-1,0);
    	System.out.println();
       }
    }
}

