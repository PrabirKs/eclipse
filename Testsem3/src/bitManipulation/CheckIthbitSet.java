package bitManipulation;

public class CheckIthbitSet {

	public static void main(String[] args) {
		//to find that i th bit is set or not , just find a number which just i th bit is set that is 1 and all are 0
		// to find such number just left shift<< 1 to i times
		// then just and(&) the number with the given number it will make all the bits 0 and if the ith bit contains 1 then
		//it will be cause 1&1=1 else all will be 0's.
		
		int a = 22 ;   //10110
		int i = 3  ;   // the ith position
		
	//	find the required number
		int x = 1<<i;
    //  and(&) them
		boolean res = (a & x)!=0 ;
		System.out.println(res);
   // in one statement
	 if( (a & (1<<i))!= 0 )
		 System.out.println("1");
	 else
		 System.out.println("0");
	}
   
}
