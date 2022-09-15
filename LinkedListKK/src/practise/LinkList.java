package practise;

public class LinkList {
   Node head ;  //it is just a variable of "Node" type, and though it is not initialised through any constructor, so it is just act as reference
   class Node{
	   int data ; 
	   Node next ;
	   private Node(int data) {
		   this.data = data ;
		   this.next = null ;
	   }
   }
   public void print(Node head) {
	   Node temp = head ;
	   while(temp != null) {
		   System.out.print(temp.data + " ");
		   temp = temp.next ;
	   }
	   System.out.println("-> Null");
   }
   public void addFirst(int data) {
	   Node node =  new Node(data) ;
	   
	   
	   node.next = head ;  //means node now points to the first element of the linked list and after each insertion(think by taking consideration of more than 1 element)
	   head = node ;       //we are making the head points to that element , which has just added now
   }
   public void addLast(int data) {
	   Node node =  new Node(data) ;
	   if(head == null) {
		  node.next = head ;
		  head =  node ;
		  return ;
	   }
	   Node temp =  head ;
	   while(temp.next != null) {
		   temp = temp.next ;
	   }
	   temp.next = node ;
   }
   
   public void deleteFirst() {
	   if(head==null) {
		   return ;
	   }
	   Node temp = head ;
	   head = head.next ;
	   temp.next = null ; //detatcing connections from all node and making it a grabage value
   }
   public void deleteLast() {
	   if(head == null || head.next == null) {
		   head = null ;
		   return ;
	   }
	   Node curr = head ;
	   Node prev = null ;
	   while(curr.next != null) {
		   prev = curr ;
		   curr = curr.next ;
	   }
	   prev.next = null ;
   }
   
}
