package linklist;

public class Main {

	public static void main(String[] args) {
       
		LnkList list=new LnkList();
		list.insertFirst(36);
		list.insertFirst(32);
		list.insertFirst(13);
		list.insertFirst(23);
		list.insertFirst(34);
		//insert at last 
		list.insertLast(22);
		list.insertLast(29);
		list.display();
		//insert at index
		list.insertAtIndex(102,3);
		list.display();


	}

}
