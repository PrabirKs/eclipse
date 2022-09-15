package question;

import java.util.*;

public class MaxConscecOnesAfterModify {

	public static void main(String[] args) {
		// int arr[] = {1,0,0,1,0,1,0,1,0,1,1,1};
		int n = 10;
		int k = 2;
		int arr[][] = { { 12, 1, 14, 3, 16 }, { 14, 2, 1, 3, 35 }, { 14, 1, 14, 3, 11 }, { 14, 5, 3, 2, 1 },
				{ 1, 18, 3, 21, 14 } };
		//System.out.println(found(arr, 5));
		
		int input1 = 8 ;
		int[] input2 = {1,2,1,1,1,1,1,1} ;
	//	System.out.println(maxGroups(input1,input2));
		System.out.println(divisorSum(0));
	}
	public static int maxGroups(int input1, int[] input2) {
		HashMap<Integer,Integer> map = new HashMap<>() ;
		int count = 0 ;
		for(int i = 0 ; i < input2.length ; i++) {
			map.put(input2[i],map.getOrDefault(input2[i],0) + 1) ;
			if(map.get(input2[i] ) == 2) {
				count++ ;
				map.clear();
			}
		}
		return count ;
	}
	public static int divisorSum(int n) {
		int sum = 0 ; 
		for(int i = 1 ; i <= n ;i++){
			if(n % i == 0) {
				sum+=i ;
			}
		}
		return sum ;
	}
//some corner casses are msiing
	static int max(int arr[], int n, int k) {
		int i = -1;
		int j = -1;
		int count = 0;
		int max = -1;
		while (i < arr.length - 1 && j < arr.length - 1) {
			if (count <= k) {
				j++;
				if (j != arr.length && arr[j] == 0) {
					count++;
				}
				if (count == k)
					max = Math.max(max, j - i);
			}

			else {
				i++;
				if (i != arr.length && arr[i] == 0) {
					count--;
				}
				if (count == k)
					max = Math.max(max, j - i);
			}

		}
		return max;
	}

	static int max2(int arr[], int n, int k) {
		int j = 0;
		int count = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				count++;
			}

			while (count > k) {
				if (arr[j] == 0) {
					count--;
				}
				j++;
			}
			// valid window
			max = Math.max(max, i - j + 1);
		}
		return max;
	}

	// subarray count having sum < k // it is a different queston
	static int max3(int arr[], int k) {
		int i = 0;
		int j = 0;
		int sum = 0;
		int count = 0;
		while (j < arr.length) {
			sum = sum + arr[j];

			while (sum >= k) {
				sum = sum - arr[i];
				i++;
			}
			count = count + j - i + 1;
			j++;
		}
		return count;
	}

	static int min(int arr[], int target) {
		int i = 0;
		int j = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		while (j < arr.length) {
			sum += arr[j];

			while (sum > target) {
				min = Math.min(min, j - i + 1);
				sum -= arr[i];
				i++;
			}
			j++;
		}
		return min;
	}

	static int found(int[][] arr, int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == 0) {
					map.put(arr[i][j], 1);
				} else {
					if (map.containsKey(arr[i][j]) && map.get(arr[i][j]) == i) {

						map.put(arr[i][j], map.get(arr[i][j]) + 1);

						if (i == n - 1) {
							count++;
						}
					}
				}
			}
		}

		return count;
	}
	
	
}
