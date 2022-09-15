package queueAnuj;

public class CircularQ {
    int front,rear ;
    int size ;
    int arr[];
    public CircularQ(int size) {
    	this.size = size ;
    	this.arr = new int[size] ; 
    	this.front = -1 ;
    	this.rear = -1 ;
    }
    
    public void enqueue(int data) {
    	if((rear+1)%size == front) {
    		System.out.println("qeuee is full");
    		return ;
    	}
    	if(front==-1) {
    		front = 0 ;
    	}
    	rear = (rear+1)%size ;
    	arr[rear] = data ;
   }
    
    public int dequeue() {
    	if(front == -1 ) {
    		System.out.print("queue is empty");
    		return -1;
    	}
    	int val = arr[front];
        if(front==rear) {
    	   front = rear = -1 ;        // whem the front and the rear are pointing to the same element then just one element is left
    	                           // so make it out from the queue and again bring back the array to initial condition by setting to -1
    	}
        else {
        	front = (front+1) % size ;   // after removing the data just , move the front to  front+1 % size 
         }
       return val ;  
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CircularQ q = new CircularQ(4);
       q.enqueue(3);
       q.enqueue(10);
      
      q.enqueue(7);
       System.out.println(q.dequeue());
       q.enqueue(32);
       System.out.println(q.dequeue());
       q.enqueue(72);
       System.out.println(q.dequeue());
       System.out.println(q.dequeue());System.out.println(q.dequeue());System.out.println(q.dequeue());
	}

}
