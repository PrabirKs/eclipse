package questions;
import java.util.*;
public class PrefixConversion {

	public static void main(String[] args) {
       String exp = "-+2/*6483" ;
       conversion(exp) ;
	}
	static void conversion(String exp) {
		Stack<String> infix = new Stack<>() ;
		Stack<String> postfix = new Stack<>() ;
		Stack<Integer> evaluate = new Stack<>() ;
		
		// in prefix expression the operators are put first before the operand, so we have to
		// run loop from the end . , and apart from that everything is same process
		for(int i = exp.length()-1 ; i>=0 ; i--) {
			char ch = exp.charAt(i) ;
			if(ch <= '9' && ch >= '0') {
				infix.push(ch+"") ;
				postfix.push(ch+"") ;
				evaluate.push(ch - '0') ;
			}else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				String inval1 = infix.pop() ;
				String inval2 = infix.pop() ;
				String inres  = "(" + inval1 + ch + inval2 + ")" ;
				infix.push(inres) ;
				
				String postval1 = postfix.pop() ;
				String postval2 = postfix.pop() ;
				String postres  = postval1 + postval2 + ch ;
				postfix.push(postres) ;
				
				int val1 = evaluate.pop() ;
				int val2 = evaluate.pop() ;
				int res  = calculate(val1,val2,ch) ;
				evaluate.push(res) ;
			}
		}
		System.out.println(infix.peek());
		System.out.println(postfix.peek());
		System.out.println(evaluate.peek());

	}
	 static int calculate(int var1 ,int var2 ,char ch) {
	    	if(ch == '+') {
	    		return var1 + var2 ;
	    	}else if(ch == '-') {
	    		return var1 - var2 ;
	    	}else if(ch == '*') {
	    		return var1 * var2 ;
	    	}else {
	    		return var1 / var2 ;
	    	}
	    }

}
