package searching;


public class CountEvenDgtNum {
	static int check(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(even(arr[i])) {
				count++;
			}
		}
		return count;
	}
	static int digit(int x) {
		int digit=0;
		while(x>0) {
			digit++;
			x=x/10;
		} 
		return digit;
		}
	
	static int digit2(int x) {
		int digit2=(int)(Math.log10(x))+1;   //shortcut to find the digit of a number
		return digit2;
	}
		

	static boolean even(int dgt) {
		if(digit(dgt)%2==0)
			return true;
		else
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[]= {12,23,134,1246,345,12345,71676,1111};
		System.out.println(check(arr));
		System.out.println(digit2(123));

	}

}
