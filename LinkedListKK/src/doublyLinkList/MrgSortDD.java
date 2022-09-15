package doublyLinkList;

import java.util.*;

class Node{
	int data;
	Node prev;
	Node next;
	 public Node(int data) {
		 this.data = data;
		 this.prev = null;
		 this.next = null;
	 }
}
class Dlist{
	Node head;
	Node tail;
	
	public void addlast(int data) {
		Node node = new Node(data);
		if(head==null) {
			head = tail = node ;  // head and the tail will point to the node at first
			return;
		}
		tail.next = node;     //and then the tail next will be the node
		node.prev = tail ;    //node prev will, be tail
		tail = node ;         // move tail to that node
		tail.next = null ;    // and make the tail next to null
	}
	public void addfirst(int data) {
		Node node = new Node(data);
		if(head==null) {
			head = tail = node ;
			return ;
		}
		 head.prev = node ;
         node.next = head ;
         head = node ;
         head.prev = null ;
	}
	
	public void display() {
		Node temp = head ;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next ;
		}
	}
}




public class MrgSortDD {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dlist dl = new Dlist();
        int n = sc.nextInt();
        
        for(int i = 0 ; i < n ; i++) {
        	int data = sc.nextInt();
        	dl.addlast(data);
        }
        
	}

}
