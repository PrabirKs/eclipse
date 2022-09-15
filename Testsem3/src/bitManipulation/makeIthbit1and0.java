package bitManipulation;

public class makeIthbit1and0 {

	public static void main(String[] args) {
		System.out.println("now change the ith  bit to 1 Given(1 0 1 1 0)");
	  // just do the same step find a number whose ith bit is set and or it with the given number
      // if at the ith place 1 will  be there then the 1 & 1 = 1 and 1 | 0 = 1 , at any case the  bit wil be converted to one
		int a = 22 ;   //10110
		int i = 0  ;   // the ith position
		
	//	find the required number
		int x = 1<<i;
    //  and(|) them
		int res = (a | x) ;
		System.out.println(i +"th bit changed -->" + res + ": " + Integer.toBinaryString(res));
		
		//in one line
		System.out.println(i+ "th bit changed-->"+Integer.toBinaryString(a | (1<<i)));
		
		System.out.println("\nnow change the ith  bit to 0\n");
       //nothing to do just have to find a number whoose ith bit is 0 and all the bits are 1 then , and the two number 0 & 0 = 0  and 0 &1=0
	   // to find such number whoose just ith bit is 0 , then just find a number whoose just i th bit is one then invert it. ~(1<<i)
		
	    int b = 22 ;  //1 0 1 1 0
	    i=2;
	    x = ~ (1<<i);
	    res = (a & x) ;
	    
	    System.out.println(i+"th bit changed-->"+res + ": " + Integer.toBinaryString(res));
	    // in one line
	    System.out.println(i+"th bit changed-->"+Integer.toBinaryString(b & ~(1<<i)));
	    
	   // now toggle each bit 0-->1 , 1-->0
	   // for that find a number whoose ith bit is 1 AND all are 0 , then xor them , 1 ^ 1 = 0 and 0 ^ 1 = 1
//	     for(i = 0 ; i<5 ; i++ ) {
//	    	 System.out.print();
//	     }
	    System.out.println("toggle each bit");
	    int c = 22;
	    for(i =1 ; i< 5 ; i++) {
	    x = (1<<i);
	    res = c ^ x;
	    System.out.println(i+"th bit changed-->"+Integer.toBinaryString(res));
	   }	
	}

}
