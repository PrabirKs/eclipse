package linklist02;


class Node{
	  int data;
	  Node next;
	  
	  Node(int data){
		  this.data=data;
		  this.next=null;
	  }

}
 class LinkList{
	 Node head;
	 
	 public void add(int data) {
		 Node NewNode=new Node(data);
		 if(head==null) {
			 NewNode.next=head;
			 head=NewNode;
			 return;
		 }
		 Node temp=head;
		 while(temp.next!=null) {
			 temp=temp.next;
		 }
		 temp.next=NewNode;
	 }
/////////////////////////////////////////////////////////////////////////////////////	 
	 public void display() {
		 Node temp=head;
		 while(temp!=null) {
			 System.out.print(temp.data +" --> ");
			 temp=temp.next;
		 }
		 System.out.print("NULL\n");
	 }
 //////////////////////////////////////////////////////////////////////////////////////////////////
	 //insert a node at right position in a sorted
	 
	 public void insertAtSrtdLst(int data) {
		    Node Newnode=new Node(data);
		    if(head==null   || data<=head.data) {
		    	Newnode.next=head;
		    	head=Newnode;
		    	return;
		    }
		    Node temp=head;
		    while(temp.next!=null && temp.next.data<=data) {    // if we change the sequence of the condition it will throw a null pointer exception cz .data is not in case of last.next node so if the "temp.next!=null" will be put then condn fail and it will not check the second condition in case of last node insertionr  
		    temp=temp.next;
		    }
			Newnode.next=temp.next;
	  	    temp.next=Newnode;
	 } 
	 
	//---------------------------another way----------------------------------
	 public void insertsortlist(int data) {
		   Node Newnode=new Node(data);
		   if(head==null  || head.data>=data) {
			  Newnode.next=head;
			  head=Newnode;
			  return;
		   }
		   Node current=head, temp=null;
		   while(current!=null && current.data<Newnode.data) {
			   temp=current;
			   current=current.next;
		   }
		   temp.next=Newnode;
		   Newnode.next=current;
		   temp.next=Newnode;
		  
	 } 
	 
	 //------------------remove duplicate element from a sorted list--------------------------------------------
      public void remvDuplict() {
		  Node temp=head;
		  while(temp!=null && temp.next!=null ) {    //if the last two node is equal then the last node will be deleted and the 2nd last node will be point to the null and so i have added a condition i.e. temp!=null and it will be terminated only the temp.next!=null , here there is ....
			  if(temp.data==temp.next.data) {
			       temp.next=temp.next.next;
				          }
			      else
			        temp=temp.next;
			 }
	     }
 //----------------------------reverse a link list------------------------------------------//
      public Node reverseList() {
    	  Node current=head;
    	  Node prev=null;
    	  Node after=null;
    	  while(current!=null) {
    		  after=current.next;
    		  current.next=prev;
    		  prev=current;
    		  current=after;
    	}
    	  return prev;
      }
    //-----------------------------find mid of a list----------------------------------------------//
      public Node findMid() {
     	 Node slow=head;
     	 Node fast=head;
     	 while(fast!=null && fast.next!=null) {
     		 slow=slow.next;
     		 fast=fast.next.next;
     		}
     	 return slow;
      }
    //-------------------find nth node from the end of the loop----------------------------------------//
      public Node FindNthNodFrmEnd(int n) {
     	 Node main=head;
     	 Node temp=head;
     	 int count=0;
     	 while(count<n) {
     		 temp=temp.next;
     		 count++;
     	 }
     	 while(temp!=null) {
     		 temp=temp.next;
     		 main=main.next;
     	 }
     	 return main;
      }

     
  }
 

 
public class InsertInSortedList {
   
    
    public static void main(String[] args) {
    	
		 LinkList list=new LinkList();
		 
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 list.add(40);
		 list.add(50);
		 
		 list.display();
		 
		 list.insertAtSrtdLst(35);
		 list.display();
	}
    
}


