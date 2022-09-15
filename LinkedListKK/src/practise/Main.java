package practise;

public class Main {

	public static void main(String[] args) {
		LinkList ll  = new LinkList() ;
		//adding values to the list
		
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		
		ll.print(ll.head);
		
        ll.addLast(40);
        ll.addLast(50);
        
        ll.print(ll.head);
        
        ll.deleteFirst();
        ll.deleteLast();
        ll.print(ll.head);
	}

}
