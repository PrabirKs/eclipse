package questions;
import java.util.*;
public class InfixConversion {

	public static void main(String[] args) {
		String exp = "a*(b-c)/d+e" ;
		String s = "((2+((6*4)/8))-3)" ;
		conversion(s) ;
    }
	static void conversion(String exp) {
		Stack<String> prefix = new Stack<>();
		Stack<String> postfix = new Stack<>();
		Stack<Character> oprtr = new Stack<>() ;
		
		for(int i = 0 ; i < exp.length() ;i++) {
			char ch = exp.charAt(i) ;
			if(ch == '(') {
				oprtr.push(ch) ;
			}else if( (ch >= '0' && ch <='9') || (ch >='a' && ch <='z') || (ch >='A' && ch <='Z') ) {
				prefix.push(ch + "");  // add by converting it to string
				postfix.push(ch + "");
				
			}else if(ch == ')') {
				while(oprtr.peek()!='(') {
					calculate(prefix,postfix,oprtr) ;
			    }
				oprtr.pop() ;
			}else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
				while(!oprtr.isEmpty() && oprtr.peek()!='(' && precedence(ch) <= precedence(oprtr.peek())) {
					calculate(prefix,postfix,oprtr) ;
			   }
				oprtr.push(ch) ;
			}
				
		}
		while(!oprtr.isEmpty()) {
	     	calculate(prefix,postfix,oprtr) ;
		}
		System.out.println(prefix.pop());
		System.out.println(postfix.pop());
	   
	}
	
	static int precedence(char ch) {
		if(ch == '+' || ch == '-') {
			return 1 ;
		}else if(ch == '*' || ch == '/') {
			return 2 ;
		}else {
			return 0 ;
		}
	}
	
   static void calculate(Stack<String> prefix , Stack<String> postfix , Stack<Character> oprtr) {
	   char oprt = oprtr.pop();
		
		String preval2 = prefix.pop() ;
		String preval1 = prefix.pop() ; 
		String preres = oprt + preval1 + preval2 ;  // prefix calculation
		prefix.push(preres);
		
		String postval2 = postfix.pop() ;
		String postval1 = postfix.pop() ; 
		String postres = postval1 + postval2 + oprt; //postfix calculation
		postfix.push(postres);

   }
}
