package iteration;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[];
		nums=new int[8];
		for(int i=0;i<5;i++)
		{
			nums[i]=i;
		}
		for(int x:nums) //the loop will continue from nums[0] to nums[8] no matter how much element get assigned
		{
			System.out.println(x);
		//	if(x==4)
		//		break;                  //the for each version can be stoped in betn the loop through break statement;
	
		}

	}

}
