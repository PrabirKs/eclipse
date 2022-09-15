package searching;

import java.util.Arrays;

public class Search2Darray {
	static int[] findIndex(int[][] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					return new int[]{i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{2,3,4,78,98},{4,5,6}};
		int target=780;
		int index[]=findIndex(arr,target);
		System.out.print(Arrays.toString(index));

	}

}
