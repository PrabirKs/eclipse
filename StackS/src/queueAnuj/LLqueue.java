package queueAnuj;
import java.util.*;
//this is the linklist implementation of the queue , all the data are added on the rear side and all the data are come out from the front side
//means first in first out and last in last out ;
class Node{
	int data  ;
	Node next ;
	public Node(int data){
		this.data = data ;
		this.next = null ;
	}
}



public class LLqueue {
    Node front,rear ;
 public void enqueue(int data) {
    	Node node = new Node(data);
    	if(front==null) {
    		front  = rear = node ;
    		return;
    	}
    	rear.next = node ;
    	rear = node ;
    }	
    
  public int dequeue() {
	  if(front==null) {
		  System.out.println("queue has no element");
		  return -1 ;
	  }
	  int val = front.data ;
	  front = front.next ;
	  return val ;
  }
    public static void main(String[] args) {
        LLqueue q = new LLqueue();
        q.enqueue(12);
        q.enqueue(32);
        q.enqueue(55);
        q.enqueue(11);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(89);
        q.enqueue(55);
        q.enqueue(11);
        System.out.println(q.dequeue());

	}

}
