package circularlnklist;

class ListNode{
	int data;
	ListNode next;
	public ListNode(int data) {
		this.data=data;
	}
}

public class CircularList {
     ListNode last;
     int length;
     public CircularList() {
    	 last=null;
    	 this.length=0;
     }
     
     public void add() {
    	 ListNode first=new ListNode(1);
    	 ListNode second=new ListNode(8); 
    	 ListNode third=new ListNode(10);
    	 ListNode fourth=new ListNode(16);
    	 
    	 first.next=second;
    	 second.next=third;
    	 third.next=fourth;
    	 fourth.next=first;
    	 
    	 last=fourth;
    		 
    	}
     
     public void display() {
    	 if(last==null) {
    		 System.out.println("no element");
    		 return;
    	 }
    	 ListNode first=last.next;
    	 while(first!=last) {
    		 System.out.print(first.data+" -> ");
    		 first=first.next;
    	 }
    	 System.out.print(first.data);
     }
     
     public static void main(String[] args) {
		CircularList list=new CircularList();
		
		list.add();
		list.display();
	}
}

