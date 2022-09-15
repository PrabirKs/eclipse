package linklist02;
	 
public class RemovDuplctInSrtdList {
	 
    public static void main(String[] args) {
    	
		 LinkList list_1=new LinkList();
		 
		 list_1.add(10);
     	 list_1.add(10);
	 
		 list_1.add(20);
		 
		 list_1.add(30);
		list_1.add(30);
		 list_1.add(30);
			list_1.add(30);
		 
		 list_1.add(40);
		 list_1.add(40);
		 
		 list_1.add(60);
		 list_1.add(60);
	
		 
		list_1.display();
		
		list_1.remvDuplict();
		list_1.display();
	}
    
}
