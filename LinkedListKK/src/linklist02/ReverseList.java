package linklist02;

public class ReverseList {

	public static void main(String[] args) {
	    LinkList List_2=new LinkList();
	    
	    List_2.add(10);
	    List_2.add(20);
	    List_2.add(30);
	    List_2.add(40);
	    List_2.add(50);
	    List_2.add(70);
	  
	    List_2.display();
	    
	    List_2.head=List_2.reverseList();
	    List_2.display();
	    
	    System.out.println("mid= "+ List_2.findMid().data);
	    

	}

}
