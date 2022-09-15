package bitManipulation;
import java.util.*;
public class BitMasking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int n = input.nextInt();
	      int d = input.nextInt();
	      int a[] = new int[16];
	      for(int i = 0; i < 16; i++){
	         if((n & (1 << i)) > 0){
	           a[i] = 1;
	         }
	      }
	      System.out.println(Arrays.toString(a));
	      int ans = 0, power = 1;
	      for(int i = 0; i < 16; i++){
	    	  System.out.println("indexxx= "+ (i - d + 16)%16+" powerrr= "+power);
	        if(a[(i + d ) % 16] == 1){
	        	System.out.println("index:" + (i - d + 16) % 16);
	          ans = ans + power;
	          System.out.println("ans= "+ans +" power= "+power);
	        }
	        power = power * 2;
	      }
	      System.out.print(ans + " : "+Integer.toBinaryString(ans));
	      ans = 0; power = 1;
	      for(int i = 0; i < 16; i++){
	        if(a[(i + d)% 16] == 1){
	        	ans = ans + power;
	        }
	        power = power * 2;
	      }
	      System.out.println(" \n" + ans+" : "+Integer.toBinaryString(ans));
	}

}
