package searching;

public class LinearSearch {

    static public int LinearSrch(int[] arr,int target){
    	int i=0;
	      for(i=0;i<arr.length;i++){
	          if(arr[i]==target)
	          break;
	      }
	     
	 return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,14,17,45,123,122,15,43,776};
		int target=17;
		System.out.println(LinearSrch(arr,target));

	}

}
