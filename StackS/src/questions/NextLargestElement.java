package questions;
import java .util.* ;
public class NextLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
        	arr[i]= sc.nextInt();
        }
        System.out.println(findRight(arr,n));
	}
	
  public static ArrayList findRight(int[] arr, int n) {
	  ArrayList<Integer> res= new ArrayList<>();
	  Stack<Integer> st = new Stack<>();
	  
	  for(int i=n-1;i>=0;i--) {
		  if(st.size()==0) {      // initially if the stack is empty means for evry right most element there is no more element in the right whih
			  res.add(-1);        // is bigger so ans for this will be -1 so add it in the res array list
		  }
		  else if(st.size()>0 && st.peek() > arr[i]) {        // if the stack is not  empty and the top element means the rightest element is
			  res.add(st.peek());  // greater than the arr[i] then  this is the ans and add it to the array list.
		  }
		  
		  else if(st.size()>0 && st.peek()<arr[i]) {       // in case the right element means the recently pushed element in the stack is smaller than
			   while(!st.isEmpty() && st.peek()<=arr[i]) { // the arr[i] then run a loop untill it reaches to the bigger element than this
			   st.pop();      // and it can be possible by popping the smaller element one by one ,, untill b igger element not reached
			  }
			   if(st.isEmpty()) {       // if loop run to the last element in the sttack and not find any bigger element and pop alll the element
				   res.add(-1);         // the stack is empty now so add -1 as the answer in the res list
			   }
			   else {
				   res.add(st.peek());  // else the while loop reached the element in the stack which is bigger so, now add that elemtn in the res list
			   }
		  }
		  st.push(arr[i]) ;             // after checking these push the element in the stack.  
	  }
	  Collections.reverse(res);       // though anser for each element added fromm the last so reverse the list and return
	  return res;
  }
  
  /*  //smallest code 
   *  public static ArrayList find(int[] arr, int n) {
	  ArrayList<Integer> res= new ArrayList<>();
	  Stack<Integer> st = new Stack<>();
	  
	  for(int i=n-1;i>=0;i--) {
		while(!st.isEmpty()  && st.peek()<=arr[i]){
          st.pop();
        }
        if(st.isEmpty()){
          res.add(-1);
        } else{
          res.add(st.peek());
          }
        st.push(arr[i]);
     }
	  Collections.reverse(res);       // though anser for each element added fromm the last so reverse the list and return
	  return res;
     }
   */
  
  
 //can also just use a array to add result set index as n and res[n--] = s.peek() ; , write like this as answer 
  
  
}
