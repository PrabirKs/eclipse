package doublyLinkList;


public class DoubList {
	
	class ListNode{
		int data;
		ListNode prev;
		ListNode next;
		
		public ListNode(int data){
			this.data=data;
			this.prev=null;
			this.next=null;
		}
	}

	  ListNode head;
	  ListNode tail;
	  int Length;
	  
	  public DoubList() {
		  this.head=null;
		  this.tail=null;
		  this.Length=0;
	  }
	  
	  public boolean isEmpty(){
		return Length==0;                //or head==null
	  }
	  
	  public int length(){
		  return Length;
	  }
	  
	  public void displayForward() {
		  if(isEmpty()) {
			  System.out.println("no element in the list");
			  return;
		  }
		  ListNode temp=head;
		  System.out.print("null <- ");
		  while(temp!=null) {
			  System.out.print("|"+temp.data+"|-->");
			  temp=temp.next;
		  }
		  System.out.print("null\n");
	  }
	  
	  public void displayBackward() {
		  if(isEmpty()) {
			  System.out.println("no element in the list");
			  return;
		  }
		  ListNode temp=tail;
		  System.out.print("null <- ");
		  while(temp!=null) {
			  System.out.print("|"+temp.data+"|<--");
			  temp=temp.prev;
		  }
		  System.out.print("null\n");
	  }

	  
	  public void insertAtFirst(int data) {
		  ListNode node=new ListNode(data);
		  if(isEmpty()) {
			  tail=node;
		  }
		  else {
			  head.prev=node;
		  }
		  node.next=head;
		  head=node;
		  Length++;
		  
	  }
	  

	  
	  public void deleteFromFirst() {
		  if(isEmpty()) {
			  System.out.println("no element in the node");
			  return;
		  }
		  ListNode temp=head;
		  if(head==tail) {
			  tail=null;
		  }
		  else {
			  head.next.prev=null;
		  }
		  head=head.next;
		  temp.next=null;
		  Length--;

	  }
	  public void insertAtLast(int data) {
		  ListNode node=new ListNode(data);
		  if(isEmpty()) {
			  head=node;
		  }
		  else {
			  tail.next=node;
			  node.prev=tail;
		  }
		  tail=node;
		  Length++;
		}
	  
	  public void deleteFromLast() {
		  if(isEmpty()) {
			  System.out.println("no element in the node");
			  return;
		  }
		  ListNode temp=tail;
		  if(head==tail) {
			  head=null;
			}
		  else {
			  tail.prev.next=null;
		  }
		  tail=tail.prev;
		  temp.prev=null;
		  Length--;
	  }
	  
	  
	  public void insertAtNthNode(int data,int index) {
		  ListNode node=new ListNode(data);
		  if(index<1 || index>Length+1) {
			  System.out.println("invalid attempts!!!");
			  return;
		  }

		  if(index==1) {
			 this.insertAtFirst(data);
			 return;
			  
		  }
		 		 
			  ListNode temp=head;
			  
		  for(int i=1;i<index-1;i++) {
			  if(temp!=null) 
				  temp=temp.next;                   //reach to the previous node
			  }
		   if(temp!=null) {
			 node.next=temp.next;
			 node.prev=temp;        
			 Length++;
			 
			 temp.next=node;
			 if(node.next!=null) {            //in case of insertion after the last node check that;
				 node.next.prev=node;
			 }
			
		  }
	   }
	  
	  public void deleteAtNth(int index) {
		  
		  if(head==null || index<=0) {
			  return;
		  }
		  ListNode temp=head;
		  Length--;
		  for(int i=1;temp!=null && i<index;i++) {
			    temp=temp.next;
		  }
		  
		  //System.out.println(temp.data+"EWFWEF");
		  
		  if(temp.next!=null) {
			  temp.next.prev=temp.prev;
		  } else {
			  tail=tail.prev;
		  }
		  
		  if(temp.prev!=null) {
			  temp.prev.next=temp.next;
		  } else {
			  head=head.next;
		  }
		
	   temp=null;                 
	   //means it will now point to null no relation with the list
	 //  System.out.println("temp.data="+temp.prev.data);

	  }
		  
	  
		 
     
   } 
	  
	  

