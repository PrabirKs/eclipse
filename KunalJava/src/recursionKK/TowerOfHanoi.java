package recursionKK;

public class TowerOfHanoi {

	public static void main(String[] args) {
		solve('a','c','b',2) ;

	}
    static int count = 1 ;
	static void solve(char source , char destination , char helper , int n) {
		if(n==0) return ;
		
		solve(source,helper,destination,n-1);  //place n-1 disk in helper
		System.out.println((count++) +": "+source + " --> " + destination  + ": " + n);  //each time print the sorce and destination
		solve(helper,destination,source,n-1);  //then place that n-1 disk from helper to destination
	}
}

//INTIUTION : LET WE HAVE  1 DISK SO MOVE A->C | IF HAVE 2 disk then A->B , A->C , B->C 
//            if haeve 3 disk then recursively find it, HOW??
//            Transfer n-1 (2) disk  A->B . Now N-1 (2) disk in "B" now it will work as source , and destination is same as before "C"
//            we have the solution before for 2 disk , here only the "src" and "dest" and "helper" is changed , but it will give answr
//            according to this .  like wise we will check for any n.
//            1,3,7,15,31,63,127,255......... steps 