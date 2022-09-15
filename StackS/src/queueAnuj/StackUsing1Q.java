package queueAnuj;
import java.util.*;
public class StackUsing1Q {
    Queue<Integer> q1;
    public StackUsing1Q() {
    	q1 =  new ArrayDeque<>();
    	}
    public void push(int data) {
    	q1.add(data);
    	int size = q1.size() ;
   
    	while(size-1!=0) {
    		q1.add(q1.peek()) ;
    		q1.poll();
    		size--;
    	}
    }
    
    public int pop() {
    	if(q1.isEmpty()) {
    		System.out.print("empty");
    		return -1 ;
    	}
    	int data = q1.peek() ;
    	q1.poll() ;
    	return data;
    }
	public static void main(String[] args) {
		 StackUsing1Q s = new StackUsing1Q();
		  
		  s.push(12);
		  s.push(13);
		  s.push(14);
		  s.push(15);
		  
		  System.out.println(s.pop());
		  System.out.println(s.pop());
		  System.out.println(s.pop());
		  s.push(16);
		  s.push(17);
		  System.out.println(s.pop());
		  System.out.println(s.pop());
		  System.out.println(s.pop());

	}

}
