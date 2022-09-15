package queueAnuj;
import java.util.*;
public class QusingStack {
   
    Stack<Integer> s1 ;
    Stack<Integer> s2  ;
    public QusingStack(int size) {
    	this.s1 = new Stack<>();
    	this.s2 = new Stack<>();
    }
    
    public void enqueue(int data) {
    	s1.push(data);
    }
    public int dequeue() {
    	int data = -1 ;
    	if(s1.isEmpty() && s2.isEmpty()) {
    		System.out.print("queue is empty");
    		return -1 ;
    	}
    	
    	if(s2.isEmpty()) {
        	while(!s1.isEmpty()) {
    		s2.push(s1.peek());
    		s1.pop();
    	 }
      }	
    	    data = s2.peek() ;
    		s2.pop();
            return data ;
    }
    
	public static void main(String[] args) {
		QusingStack q =  new QusingStack(5);
		
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.enqueue(15);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(16);
		q.enqueue(17);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.enqueue(56);
		System.out.println(q.dequeue());
		q.enqueue(45);
		q.enqueue(44);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(90);
		System.out.println(q.dequeue());
		

	}

}
