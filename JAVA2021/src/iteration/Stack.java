package iteration;

public class Stack {
	int stck[]=new int[10];
	int tos;
	//initialize the top of the stack
 
	Stack() {
		tos=-1;
	}
	
	//push
	void push(int item) {
		if(tos==9) 
			System.out.println("the stack is full");
			else
				stck[++tos]=item;
		}
	//pop
	int pop() {
		if(tos<0) {
			System.out.println("stack is empty");
		return 0;
		}
		else 
			return stck[tos--]; 
	}
	void print() {
		while(tos!=-1) {
			System.out.println(stck[tos]);
			tos--;
		}
	}
}

class teststack{
	public static void main(String args[]) {
		Stack mystack1=new Stack();
		Stack mystack2=new Stack();
		//pushing items into the stack
		//for(int i=0;i<10;i++) 
			//mystack1.push(i);
	for(int i=0;i<20;i++)
			mystack2.push(i);
		System.out.println("printing the element");
		int p=mystack2.pop();
		//mystack1.print();
		mystack2.print();
	}
}
