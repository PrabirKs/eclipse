package queueAnuj;
import java.util.*;



public class ArQueue {
    int rear ;
    int size ;
    int arr[];
    
    public ArQueue(int size) {
    	this.size = size ;
    	this.arr = new int[size];
        rear = -1 ;
    }
    
    public void enqueue(int data) {
    	if(rear == size-1) {
    		System.out.println("queue full");
    		return ;
    	}
    	arr[++rear] = data ;
    }
    
    public int dequeue() {
    	if(rear == -1) {
    		System.out.println("queue is empty");
    		return -1 ;
    	}
    	int val = arr[0];
    	for(int i = 0 ; i < rear ; i ++) {
    		arr[i] = arr[i+1] ;
    	}
    	rear--;
    	return val ;
    }
	
	public static void main(String[] args) {
		ArQueue q = new ArQueue(5);
		q.enqueue(5);
		q.enqueue(7);
		q.enqueue(10);
		q.enqueue(12);
		q.enqueue(18);
	
		
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		
		q.enqueue(666);
		q.enqueue(45);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}
