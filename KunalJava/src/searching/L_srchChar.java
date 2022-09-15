package searching;
import searching.*;

public class L_srchChar {
     static boolean Ls(String s,char target) {
    	 if(s.length()==0) return false;
    	 
    	/* for(int i=0;i<s.length();i++) {
    		 if(target==s.charAt(i)) {
    			 return true;
    		 }
    	} */
    	 for(char c:s.toCharArray()) {
    		 if(c==target)
    			 return true;
    	 }
    	 return false;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="kunal";
		char target='0';
		System.out.print(Ls(s,target));

	}

}
