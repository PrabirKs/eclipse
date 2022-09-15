package practise;
import java.util.*;

public class TwoNumadd {
	
	 Node head;
	 
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
    
     
     public void add(int data) {
    	 Node node = new Node(data);
    	 node.next = head;
    	 head = node ;
     }
     public void display(Node h) {
    	 Node temp = h ; 
    	 while(temp!=null) {
    		 System.out.print(temp.data+"->");
    		 temp = temp.next ; 
    	 }
     }
     public Node listAdd(TwoNumadd list1, TwoNumadd list2) {
			Node head1 = list1.head ; Node head2 = list2.head ; 
		    int carry = 0 ;
			while(head1!=null && head2!=null) {
				
				int sum = head1.data + head2.data + carry;
				this.add(sum%10);
				carry = sum / 10 ;
				head1= head1.next ; 
				head2 = head2.next ;
			}
			while(head1!=null) {
				int sum = head1.data + carry ;
				this.add(sum%10);
				carry = sum /10 ;
			}
			while(head2!=null) {
				int sum = head2.data + carry ;
				this.add(sum%10);
				carry = sum /10 ;
			}
			if(carry!=1) {
				this.add(carry);
			}
			return head;
		
		}
     
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		TwoNumadd list1 = new TwoNumadd();
		TwoNumadd list2 = new TwoNumadd();
		TwoNumadd list3 = new TwoNumadd();

		for(int i = 0 ; i < 4 ; i++) {
			int data = sc.nextInt();
			list1.add(data);
		}
		for(int i = 0 ; i < 4 ; i++) {
			int data = sc.nextInt() ;
			list2.add(data);
		}
		
	   Node h = list3.listAdd(list1,list2);
	   
	   list1.display(h);
	}
	
}
