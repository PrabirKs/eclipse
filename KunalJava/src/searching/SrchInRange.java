package searching;

public class SrchInRange {

    static public int LinearSrch(int[] arr,int target,int start,int end){
    	if(arr.length==0)
    		return -1;
    	  int i;
	      for(i=start;i<end;i++){
	          if(arr[i]==target)
	          break;
	      }
	     
	 return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {12,14,17,45,123,122,15,43,776};  //new int[] can be skip
		int target=17;
		int start=0,end=4;
		System.out.println(LinearSrch(arr,target,start,end));

	}

}
