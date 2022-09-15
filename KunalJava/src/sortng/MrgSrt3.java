package sortng;

import java.util.Arrays;
import java.util.Scanner;

public class MrgSrt3 {
	 public static long count(int[] a){
	      if(a.length == 1)
	        return 0;
	      int mid = a.length / 2;
	      
	      int left[] = new int[mid];
	      int right[] = new int[a.length - mid];
	    
	      for(int i = 0; i < mid; i++)
	        left[i] = a[i];
	      
	      for(int i = mid; i < a.length; i++){
	        right[i - mid] = a[i];
	      }
	      System.out.println(Arrays.toString(left) + " " + Arrays.toString(right));
	      long cnt = count(left) + count(right);
	      
	      int i = 0, j = 0, k = 0;
	      
	      while(i < left.length && j < right.length){
	        if(left[i] <= right[j]){
	          a[k++] = left[i++];
	        }else{
	          a[k++] = right[j++];
	          cnt = cnt+ mid - i;     /*At any step in merge(), if a[i] is greater than a[j], 
	                                   then there are (mid – i) inversions*/
	        }
	      }
	      while(i < left.length){
	        a[k++] = left[i++];
	      }
	      while(j < right.length){
	        a[k++] = right[j++];
	      }
	      return cnt;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner input = new Scanner(System.in);
//	      int testcases = input.nextInt();
//	      while(testcases-- > 0){
//	        int n = input.nextInt();
//	        int a[] = new int[n];
//	        for(int i= 0; i < n; i++){
//	          a[i] = input.nextInt();
//	        }
	//}
		//int[] a = {1,5,2,8,4,10,3};
		int a[] = {5,3,2,4,1} ;
	        long c=count(a);
	        System.out.println(c);
	        System.out.print(Arrays.toString(a));

	//}

  }
}
