package linklistStack;

public class Main {

	public static void main(String[] args) {
		LinkListStack stack= new LinkListStack();
		
		stack.push(45);
		stack.push(34);
		stack.push(12);
		stack.push(90);
		
		stack.display(); 
		System.out.println(stack.size());
		stack.pop() ;
		System.out.println(stack.size());
		System.out.println("\n"+stack.peek());
		

	}

}
