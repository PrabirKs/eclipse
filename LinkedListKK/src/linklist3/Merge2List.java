package linklist3;

import java.util.Scanner;

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
	 
	 public void display(Node head) {
			Node current = head;
			while(current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
 
	 public void add(int data) {
		  {
	    	  Node Newnode=new Node(data);
	    	      if(head==null) {
	    	    	  head=Newnode;  //simply point head to the node to which Newnode points
	    	    	  return;
	    	      }
	    	      Node temp=head;
	    	      while(temp.next!=null) {
	    	    	  temp=temp.next;
	    	      }
	    	      temp.next=Newnode;
	       }
	 }
 
	
	 public Node Merge(Node head1,Node head2){
		
		 if(head1==null) return head2;
	     if(head2==null) return head1;
			
			
	     if(head1.data>head2.data) {     // firstly find the head of the two list that which is smaller and alwaYS POINT the head1 to the smaller node
	    	 Node temp=head1;            // swapping the node in case of head1 is graeter than head2.data
	    	 head1=head2;
	    	 head2=temp;
	     }
	     
	     Node res=head1;   // point res to the head which have small value  
	     
	     while(head1!=null && head2!=null) {
	    	 Node track=null;
	    	 
	    	 while(head1!=null && head1.data<=head2.data) {  // looop will continue until  the head1 is smaller than the head2 and the link will be ramain as usual
	    		 track=head1;                                // track will keep track of the last head1 value which is remain smaller from the head2 value
	    		 head1=head1.next;                           // move head untill it bacmae larger than the head2.data
	         }
	    	                                                //the above loop will termionate when the head1.data > head2.data and now track pointer points
	    	 // to the last head1.data which is smaller than the head2. and now head1 is biggeer than  head2 so track poits to head2 and we will swap the head1 and
	    	 // and head2 again , and perform the same action
	    	 
	    	 track.next=head2;             // track poits to the head2 which is smaller than head1,                           
	    	 
	    	 //then again swap the head1 to the smaller node and head2 to bigger
	    	 Node temp=head1;        
	    	 head1=head2;           //again head1 became smaller and head2 became larger
	    	 head2=temp;            
	   }
	     return res;               // at last return the res pointer which was same as track and points to the head of the smaller node.
	}	 
	 

 }



public class Merge2List {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   LinkList list1=new LinkList();
      
       
     for(int i=0;i<n;i++){
       int data=sc.nextInt();
       list1.add(data);
     }
     
       int m=sc.nextInt();
       LinkList list2=new LinkList();
       
      for(int i=0;i<m;i++){
       int data=sc.nextInt();
       list2.add(data);
     }
      
//      list1.display();
//      list2.display();
      
      LinkList ans=new LinkList();
     Node h=ans.Merge(list1.head,list2.head);
      
     ans.display(h);
  }
}













/*public Node merge(Node temp1,Node temp2) {
		Node head1=temp1;   Node head2=temp2;
		if(head1==null) return head2;
		if(head2==null) return head1;
		
		if(head1.data>head2.data) {
			Node temp=head1;
			head1=head2;
			head2=temp;
		}
		
		Node res= head1;
		
		while(head1!=null && head2!=null) {
			Node tmp=null;
			while(head1!=null && head1.data<=head2.data) {
				tmp=head1;
				head1=head1.next;
			}
			tmp.next=head2;
			
			
			Node temp=head1;
			head1=head2;
			head2=temp;
		}
		 return res;
	}   */
