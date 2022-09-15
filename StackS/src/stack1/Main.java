package stack1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Stack01 stack=new Stack01(5);
		
		stack.push(12);
		stack.push(34);
		stack.push(33);
		stack.push(15);
		stack.push(24);
		stack.push(29);
		
	    System.out.println(stack.top());
	    stack.pop();
	    System.out.println(stack.top());
	    Stack<Character> s=new Stack<>();
	    s.push('(');
	    s.push('{');
	    s.push(']');
	    
	    System.out.println(s.lastElement() == ']');
	    System.out.println(s.peek());
	    
	}

}
