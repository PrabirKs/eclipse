package linklist02;

public class FindNthNodeFrmEnd {

	public static void main(String[] args) {
		LinkList list_3=new LinkList();
	    list_3.add(10);
	    list_3.add(20);
	    list_3.add(30);
	    list_3.add(40);
	    list_3.add(50);
	    list_3.add(70);
	    
	    list_3.display(); 
	    
	    int n=6;
	    System.out.println(n+"th node from lastL: "+list_3.FindNthNodFrmEnd(n).data);
	    
	}

}
