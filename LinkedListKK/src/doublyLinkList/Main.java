package doublyLinkList;

public class Main {

	public static void main(String[] args) {
	 	DoubList list1=new DoubList();
	 	
	 	list1.insertAtFirst(10);
	 	list1.insertAtFirst(12);
	 	
	 
	 //	list1.displayForward();;
	 	
	 	list1.insertAtLast(44);
	 	list1.insertAtLast(33);
	 	
	 	list1.displayForward();
    	//list1.displayBackward();
	 	list1.deleteFromLast();
	 	
	 	list1.insertAtNthNode(90, 1);
	 	list1.displayForward();
		list1.insertAtNthNode(80,3 );
	 	list1.displayForward();
	 	
     	list1.deleteAtNth(3);
	 	list1.displayForward();
    	list1.displayBackward();
	 	System.out.println("length:"+ list1.Length);
	 	

	}

}
