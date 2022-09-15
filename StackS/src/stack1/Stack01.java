package stack1;

public class Stack01 {

	private int top=-1;
	private int arr[];
	
	Stack01(int size){
		this.arr=new int[size];
	}

  public boolean isEmpty() {
	  return top==-1;
  }
  public boolean isFull() {
	  return top==arr.length-1;
  }
  public void push(int data) {
	  if(isFull()) {
		  System.out.println("stack over Flow!!");
	  }
	  else {
	  top++;
	  arr[top]=data;
	  }
  }
  public void pop() {

	  if(isEmpty()){
		  System.out.println("stack has no element!!");
		  return;
		  
	    }
	   top--;
	}
  public int top() {
	  return arr[top];
  }
}
