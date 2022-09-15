package questions;
import java.util.*;

public class BalanceBracket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		System.out.println(check(s));

	}
 static boolean check(String s) {
	 Stack<Character> stack=new Stack<>();
	 if(s.length()==0 || s.length()%2 !=0 || s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']') {
		 return false ;
	 }
	  char pushed ='0';
	 for(int i=0;i<s.length();i++) {
		 if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
		 pushed=s.charAt(i);
		 stack.push(pushed);
		 }
		 else {
		   if(!stack.isEmpty()) {
			 if( (stack.lastElement()=='(' && s.charAt(i)==')') || (stack.lastElement()=='{' && s.charAt(i)=='}')  || (stack.lastElement()=='[' && s.charAt(i)==']')  ) {
				 stack.pop();
			 }
			 else return false;
		   }
			 else {
				 return false;
			 }
		
	   }
	 }
	 
	 if(stack.isEmpty()) {
		 return true;
	 }
	 else
		return false ;
  }

}

/* public boolean verify(char first, char second){
        if(first=='(' && second==')')
            return true;
        else
           if(first=='{' && second=='}')
               return true;
        else
            if(first=='[' && second==']')
                return true;
        else
            return false;
    } */
