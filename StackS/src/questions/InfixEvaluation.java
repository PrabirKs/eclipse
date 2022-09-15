package questions;
import java.util.* ;
public class InfixEvaluation {

	public static void main(String[] args) {
	   String exp = "2+(5-3*6/2)" ;
	   System.out.println(process(exp) ) ;

	}
    static int process(String exp) {
    	Stack<Integer> oprnds = new Stack<>() ;
    	Stack<Character> oprtrs = new Stack<>() ;
    	
    	//iterate over the loop
    	for(int i = 0 ; i < exp.length() ; i++) {
    		char ch = exp.charAt(i) ;
    		if(ch =='(') {                     
    			oprtrs.push(ch) ;
    		}else if(Character.isDigit(ch)) {
    			oprnds.push(ch - '0') ;
    		}else if(ch == ')'){
    			while(oprtrs.peek()!='(') {            //calculate untill the '(' not come
    				 calculate(oprnds,oprtrs);
    			}
    			oprtrs.pop() ;                         //after calculating till that and pushing the result,pop'('
    		}else {
    			//when any other operator comes , then calculate untill any lower precdence oprtr comes,
    			//or oprnds stack became empty , in case of '(' encounter at the top stop and push the oprts(ch)
    			while(!oprtrs.isEmpty() && oprtrs.peek()!='(' && prcdnce(ch)<=prcdnce(oprtrs.peek())) {
    				 calculate(oprnds,oprtrs);
    			}
    			oprtrs.push(ch) ; // after oprtn when '(' not at the peek , push it
    		}
    		
    	}
    	while(!oprtrs.isEmpty()) {        // in case all equal interval oprtrs left , so repeat the same process
            calculate(oprnds,oprtrs);     //for all 
		}
    	return oprnds.peek();             // and now the oprtrs stack has only value left i.e result
    }
    
   static int operation(int v1 ,int v2, char oprtr) {
	   if(oprtr == '+') {
		   return v1+v2 ;
	   }else if(oprtr == '-') {
		   return v1 - v2 ;
	   }if(oprtr == '*') {
		   return v2 * v1;
	   }else {
		   return v1 / v2 ;
	   }
   }
   static int prcdnce(char ch) {
	   if(ch == '+' || ch == '-')
		   return 1 ;               // precedence value
	   if(ch == '*' || ch == '/')
		   return 2 ;
	   else
		   return 2 ;
    }
   
   static void calculate(Stack<Integer> oprnds ,Stack<Character> oprtrs) {
		char oprtr = oprtrs.pop() ;  //pop the oprtr
    	int v2 = oprnds.pop() ;      //second operand
   	    int v1 = oprnds.pop() ;      //first operand  //push->3 push ->2 stack[2,3]  oprnd->'-' so 3-2 = 1 is the ans , not 2-3 =-1 so
   	
   	    int res = operation(v1,v2,oprtr) ; 
	    oprnds.push(res) ;          //push the calculated value from operation fun.
   }
}  
