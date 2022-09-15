package array;
import java.util.*;
public class FindMisngNDduplcts {

	public static void main(String[] args) {
	     int arr[]= {1,2,4,3,2} ;
	     System.out.println(find(arr));
	}

	private static ArrayList<Integer> find(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		int n = arr.length ;
		int s = n * (n+1)/2 ;
		int p = n * (n + 1) * (2*n + 1)/6 ;
		
		for(int i = 0 ; i < n ; i++) {
			s -= arr[i] ;
			p -= arr[i]*arr[i] ;
		}	
		
		int missed = (s+p/s) / 2 ;             ///this is just such a simple artithemetic thing and i'm just a nalayak person in the earth that by being the topper till 9th class and by securing 100/100 marks in the math . i just cant able to understad this simple thing i have just all my iq's a all my talent and this is just a thing which is killing me every day . God please do something i am hopeless please help me .
		int repeat = missed - s ;
		
		list.add(missed) ;
		list.add(repeat) ;
		return list;
	}

}
