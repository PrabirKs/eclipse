package linklist02;

class LNode{
	  int data;
	  LNode next;
	  
	  LNode(int data){
		  this.data=data;
		  this.next=null;
	  }
  
}
class LnkLst{
	LNode head=null;
	
	public void createLoop(){
		LNode first=new LNode(10);
		LNode second=new LNode(30);
		LNode third=new LNode(45);
		LNode fourth=new LNode(50);
		LNode fifth=new LNode(56);
		
		head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=third;
		
	}
	
	public void printlist() {
		LNode temp=head;
		for(int i=0;i<10;i++) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
	}
	
	   //----------------------------check whether a list contains loop-----------------------------------------//
    public boolean checkLoop() {
  	  LNode slow=head;
  	  LNode fast=head;
  	  while(fast!=null && fast.next!=null) {
  		  slow=slow.next;
  		  fast=fast.next.next;
  		  if(slow==fast) {
  			  return true;
  		  }
  	  }
  	  return false;
    }
    
    
}

public class CheckLoop {

	public static void main(String[] args) {
		
           
           LnkLst list=new LnkLst();
           list.createLoop();
           list.printlist();
           
           System.out.println("\n"+list.checkLoop());
	}

}
