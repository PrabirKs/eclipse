package linklist;

public class LnkList {
	
       private Node head;      // creating a object head of type Node
       private Node tail;      // creating a object tail of type Node
       
         private int size;     // the size (length) of the link list
         public LnkList() 
               {
	              this.size=0;   //for every linklist it initializes with the size=0;
               }
	
  //function to insert a node at the begining through the insertFirst function 

    public void insertFirst(int val) {             
	      Node node= new Node(val);             // call node constructor and add the value to the node
	      node.next=head;
	      head=node;
	      if(tail==null) {
	    	  tail=head;
	      }
	      size++;
      }
   //function to add a node at the end
    public void insertLast(int val) {
    	if(tail==null) {
    		insertFirst(val);
    	}
    	Node node=new Node(val);
    	tail.next=node;
    	tail=node;
    	size++;
    }
    //insert at any given index
    public void insertAtIndex(int val,int index) {
    	if(index==0) {
    		insertFirst(val);
    		return;
    	}
    	if(index==size) {
    		insertLast(val);
    		return;
    	}
    	
    	Node temp=head;
    	for(int i=1;i<index;i++) {
    		temp=temp.next;  // System.out.println(temp.next.value);  //pass the node at the index to the Node class constructor
    	}
    	
    	Node node=new Node(val,temp.next);
    	temp.next=node;
    	
    	size++;
    }
    
    //method to display the linked list
    public void display() {
    	Node temp= head;
    	while(temp!=null) {
    		System.out.print(temp.value+" -> ");
    		temp=temp.next; 
    	}
    	System.out.println("End");
    }


    //Node class 
    
    private class Node{         // this is the inner class
	 
     	private int value;   // for storing the value of the linklist
	
	    private Node next;   // object of node type
	
	     public Node(int value) {      //constructor to assign the value of the node
	      	this.value = value;
	      }  
	
	     public Node(int value ,Node next) {
	       	 this.value = value;                //constructor to assign the value and assigning the new object reference to the existing node
		     this.next=next;
	       }
	
       }

}

