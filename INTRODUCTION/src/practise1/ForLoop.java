package practise1;

public class ForLoop {

	public static void main(String[] args) {
	//type 1
		for(int a= 0 ,b = 5 ; a<b ; a++ , b--) {
		 System.out.println(a + " " + b);	
		}
	// type 2	
		int a , b ;
		for(a= 3 ,b = 10 ; a<b ; a++ , b--) {
			 System.out.println(a + " " + b);	
			}
     //type 3
		boolean flag =  true ;
		for(int i = 1 ; flag ;i++) {
			if(i==5) flag = false ;
			System.out.print(i);
		}
     //type 4 
		boolean check = false ;
		int i = 0 ;
		for(; !check ;) {
			i++ ;
			if(i == 7) check =  true ;
			System.out.print("\n" + i);
		}
	}

}
