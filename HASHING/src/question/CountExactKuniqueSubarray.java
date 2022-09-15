package question;
import java.util.*;
//here our main motto is to find the count of subarray of exact k , element
//this is found by calculating the at max(k) element and calculate at max(k-1)
//unique subarray present , and it is calculated by their difference
//c(k) - c(k-1)
public class CountExactKuniqueSubarray {

	public static void main(String[] args) {
		int arr[] = {1,2,1,2,3} ;
		int k = 2 ;
		System.out.println(countExactK(arr,k));

	}
    static int countExactK(int arr[] , int k) {
    	int countAtMaxK = countAtMaxK(arr,k) ;
    	int countAtMaxK_1 = countAtMaxK(arr,k-1) ;
    	return countAtMaxK - countAtMaxK_1 ;
    }
    static int countAtMaxK(int[] arr , int k) {
		int i = 0 ;
		int j = 0 ;
		int count = 0 ;
		HashMap<Integer,Integer> map = new HashMap<>() ;
		while(j < arr.length) { 
			//add each freq
			map.put(arr[j], map.getOrDefault(arr[j],0) + 1) ;
			
			//handle case when map > k , distinct element
			while(map.size() > k) {
				map.put(arr[i],map.get(arr[i]) - 1) ;
				if(map.get(arr[i])==0) {
					map.remove(arr[i]) ;
				}
				i++ ;
			}
			//now after this part , always the [i,j] have only k distinct element
			count = count + j - i + 1 ;
			j++ ;
		}
		return count ;
	}
      //using the same concept , but using the freq array
    
    public int subarraysWithKDistinct(int[] nums, int k) {
        int ans=utmostk(nums,k)-utmostk(nums,k-1);
        return ans;
    }
    public int utmostk(int[] nums,int k){
        int[] freq=new int[nums.length+1];
        int i=0,j=0,count=0,ans=0;
        while(j<nums.length){
        	
            if(freq[nums[j]]==0){
                count++;
            }
            
            freq[nums[j]]++;
            
            while(count==k+1){
                freq[nums[i]]--;
                if(freq[nums[i]]==0){
                    count--;
                }
                i++;
            }
            ans+=(j-i)+1;
            j++;
        }
        return ans;
    }
}
