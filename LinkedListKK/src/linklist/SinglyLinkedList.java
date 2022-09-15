package linklist;

//***********************************************************************************
public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data; // Can be a generic type
		private ListNode next; // Reference to next ListNode in list

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
//*************************************************************************************	
	
//Display the link list
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null\n");
	}
//*************************************************************************************		
//count the length of the link list
     public int length() {
    	 if(head==null) {
    		 return 0;
    	 }
    	 int count=0;
    	 ListNode current=head;
    	 while(current!=null) {
    		 count++;
    		 current=current.next;
    	 }
    	 return count;
     }
 //*************************************************************************************	
 //insert at the start
       public void insertatfirst(int data) {
    	   ListNode NewNode=new ListNode(data);
    	       NewNode.next=head;
    	       head=NewNode;
           }
 //*************************************************************************************   
 //insert at last
       public void insertatlast(int data) {
    	   ListNode Newnode=new ListNode(data);
    	      if(head==null) {
    	    	  head=Newnode;  //simply point head to the node to which Newnode points
    	    	  return;
    	      }
    	      ListNode temp=head;
    	      while(temp.next!=null) {
    	    	  temp=temp.next;
    	      }
    	      temp.next=Newnode;
       }
 //***************************************************************************************
 //insert at index 0 based indexing by me   0,1,2,3,4,5.........
       public void insertatindex(int data,int index) {
    	   if(index==0) {
    		   insertatfirst(data);
    		   return;
    	   }
    	   if(index==this.length()) {
    		   insertatlast(data);
    		   return;
    	   }
    	   ListNode Newnode=new ListNode(data);
    	   ListNode current=head;
    	   for(int i=1;i<index;i++) {
    		   current=current.next;
    	   }
    	   Newnode.next=current.next;
    	   current.next=Newnode;
       }
//********************************************************************************************
//by the mentor  1 based index     1,2,3,4,5.....
       public void insrtAtIndex(int data,int index) {
    	   ListNode Newnode=new ListNode(data);
    	   if(index==1) {
    		   Newnode.next=head;
    		   head=Newnode;
    	   }
    	   ListNode prev=head;
    	   for(int i=1;i<index-1;i++) {
    		   prev=prev.next;
    	   }
    	  /* ListNode current=prev.next;
    	   Newnode.next=current;
    	   prev.next=Newnode; */
    	   
    	   Newnode.next=prev.next;
    	   prev.next=Newnode;               // i think this is same
    	   
       }
//**********************************************************************************************   
//delete at begining
       public ListNode deleteFirst() {
    	   if(head==null) {
    		   return null;
    	   }
    	   ListNode temp=head;
    	   head=head.next;
           temp.next=null;
    	   return temp;
       }
//*************************************************************************************************
//delete at end
       public ListNode deleteLast() {
    	   if(head==null || head.next==null) {
    		  // return head;   //acc to mentor when the linklist has only one element then just return that dont delete it.
    		   head=null;
    		   return head;
    	   }
    	   
    	   ListNode current=head;
    	   ListNode previous=null;
    	   while(current.next!=null) {
    		   previous=current;
    		   current=current.next;
    	   }
    	   previous.next=null;
    	   return current;
       }
//*********************************************************************************************************
//delete a node from any index 
       public void deleteAtIndex(int index) {
    	   if(index==1) {
    		   head=head.next;
    		   return;
    	   }
    	   ListNode prev=head;
    	   for(int i=1;i<index-1;i++) {
    		   prev=prev.next;
    	   }
    	 //  prev.next=prev.next.next;    //in one line
    	   ListNode current=prev.next;
    	   prev.next=current.next;
       }
//*************************************************************************************************************       
//delete a node by its data       
       public void deleteAtKey(int data) {
    	   if(head.data==data) {
    		   head=head.next;
    		   return;
    	   }
    	   ListNode temp=head;
    	   while(temp.next!=null && temp.next.data!=data) {
    		   temp=temp.next;
    	   }
    	   if(temp.next==null) {
    		   System.out.println("data not found");
    		   return;
    	   }
     	   temp.next=temp.next.next;    //in one line
       }
  //--------------------------------------------------------------------------//
       //another way
       
       public void deleteatkey(int key) {
    	   if(head.data==key) {
    		   head=head.next;
    		   return;
    	   }
    	   ListNode current=head;
    	   ListNode temp=null;
    	   
    	   while(current!=null && current.data!=key) {
    		   temp=current;
    		   current=current.next;
    	   }
    	   if(current==null) {
    		   System.out.print("no data found");
    		   return;
    	   }
    	   temp.next=current.next;
       }
 
       
       
  //***********************************************************************************************************       
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		 sll.head=new ListNode(10);   // assigning a value to the head of the SingleLnkList class
		  
		  ListNode second=new ListNode(11);   //creating node 
		  ListNode third=new ListNode(12);
		  ListNode fourth=new ListNode(13);
		  ListNode fifth=new ListNode(14);
		  
		//making link between them  
		  sll.head.next=second; 
		  second.next=third;
		  third.next=fourth;
		  fourth.next=fifth;       //automatically the fifth node is pointing to the null by the ListNode constructor
		  
		  sll.display();
		  
		  System.out.println("\nlenght is:"+ sll.length());


	}
}