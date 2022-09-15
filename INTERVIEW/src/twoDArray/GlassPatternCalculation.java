package twoDArray;

public class GlassPatternCalculation {

	public static void main(String[] args) {
		
		int arr[][] = {{2,4,5},
				       {5,2,3},
				       {1,0,2} } ;
		int count = 0 ;
		for(int i = 0 ; i < 3 ;i++) {
			
			for(int j = 0 ; j < 3 ; j++) {
				if(count%2==0)
				System.out.print(arr[i][j] + " ");
				count++ ;
			}
			System.out.println();
		}

	}

}
