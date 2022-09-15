package circularlnklist;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

  public class CirlrList {
       Node head=null;
       Node tail=null;
     
  public void add(int data) {
	  Node Newnode=new Node(data);
	  if(head==null) {
		  head= Newnode;
		  tail= Newnode;
		  Newnode.next=head;
	  }
	  else {
		  tail.next=Newnode;
		  tail=Newnode;
		  tail.next=head;
	  }
  }
  
  public void print() {
	  Node temp=head;
	  if(head==null) {
		  System.out.println("List is empty");
	  }
	  else {
		  do {
			  System.out.print(temp.data+" -> ");
			  temp=temp.next;
		  } while(temp!=head);
		  System.out.println("head\n");
       }
  }
  
}