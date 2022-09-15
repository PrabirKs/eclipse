package bitManipulation;

public class SetbitCount {

	public static void main(String[] args) {
		int a = 22;  // 1 0 1 1 0
		int count = 0 ;
        for(int i = 0 ; i <= 4 ; i++) {
        	if((a & (1<<i))!=0 )
        		count++;
        }
        System.out.println(count);
      // another way here at each step the number is right shifted and then & with the 1 .
        // i.e 4) 10110>>4 = 1 & 1 = "1"  3) 10110>>3 = 1 0 & (0 1) = "0" 2) 10110>>2 = 1 0 1 & (0 0 1) = "1" 1)10110>>1=1011 & 0001="1" 0)10110>>0=10110 & 00001= 0
      // basically its getting the last digit and making and with the 1 (1&1=1 1&0=0)
        for(int i = 4 ; i >= 0 ; i--) {
    	  System.out.print((a>>i) & 1 );
       }
        //for negative number it is doing the 2's compliment thing . -7 = 1 0 0 1
	}

}
