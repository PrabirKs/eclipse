package queueAnuj;
import java.util.*;
public class StackUsingQ02 {
    Queue<Integer> q1 , q2;
    public StackUsingQ02() {
    	q1 =  new ArrayDeque<>();
    	q2 =  new ArrayDeque<>();
    }
    public void push(int data) {
    	q2.add(data);
    	while(!q1.isEmpty()) {
    		q2.add(q1.peek()) ; 
    		q1.poll() ;
    	}
    	Queue<Integer> tmp = q1 ;
    	q1 = q2 ;
    	q2 =  tmp ;
    }
    public int pop() {
    	if(q1.isEmpty()) {
    		System.out.print("empty");
    		return -1 ;
    	}
    	int val = q1.peek() ;
    	q1.poll() ;
    	return val ;
    }
	public static void main(String[] args) {
		 StackUsingQ02 s = new StackUsingQ02();
		  
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
