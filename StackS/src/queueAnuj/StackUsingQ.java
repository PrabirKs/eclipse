package queueAnuj;
import java.util.*;
public class StackUsingQ {
	Queue<Integer> q1 ;
	Queue<Integer> q2 ;
	public StackUsingQ() {
		q1 = new ArrayDeque<>();
		q2 = new ArrayDeque<>();
	}
	
	public void push(int data) {
		q1.add(data);
	}
	
	public int pop() {
		int data = 0 ;

		if(q1.isEmpty()) {
			System.out.print("stack is empty");
			return -1 ;
		}
		 else {
			while(q1.size()!=1) {          //just keep one last element in the queue and move all the element to the q2
				q2.add(q1.peek());
				q1.poll() ;
			}
			data = q1.peek() ;            // now we have the last elmnt that is added in the queue and return it and pop it , 
			q1.poll();
		}
		Queue<Integer>temp = q1 ;        // then just swap the q2 to q1 and perform the same actoin again
		q1 =  q2 ;                       // by doing this action we are just removing all the element by just keeping the lastly added
		q2 = temp ;                      // element in the queue and then pop it and then performing the same action with the q2 with 
		                                 //the remaining element .
		return data ;
	 }
     public static void main(String[] args) {
		  StackUsingQ s = new StackUsingQ();
		  
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
