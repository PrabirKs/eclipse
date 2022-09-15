package questions;
import java.util.*;
public class PostfixConversion {

	public static void main(String[] args) {
		String exp = "264*8/+3-" ;
        conversion(exp) ;
	}
	
    static void conversion(String exp) {
    	Stack<String> infix = new Stack<>();
    	Stack<String> prefix = new Stack<>() ;
    	Stack<Integer> evaluation = new Stack<>() ;
    	for(int i = 0 ; i < exp.length() ; i++) {
    	   char ch = exp.charAt(i);
    	   if(ch>='0' && ch<='9'){
    		   infix.push(ch+"") ;
    		   prefix.push(ch + "") ;
    		   evaluation.push(ch - '0') ;
    	   }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
    		   String val2 = infix.pop();
    		   String val1 = infix.pop();
    		   String res = "(" + val1 + ch + val2 + ")" ;
    		   infix.push(res);
    		   
    		   String preval2 = prefix.pop() ;
    		   String preval1 = prefix.pop() ; 
    		   String preres = ch + preval1 + preval2 ;
    		   prefix.push(preres) ;
    		   
    		   int var2 = evaluation.pop() ;
    		   int var1 = evaluation.pop() ;
    		   int result = calculate(var1,var2,ch) ; 
    		   evaluation.push(result) ;
    	   }
    	}
    	System.out.println(infix.peek());
    	System.out.println(prefix.peek());
    	System.out.println(evaluation.peek());
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
