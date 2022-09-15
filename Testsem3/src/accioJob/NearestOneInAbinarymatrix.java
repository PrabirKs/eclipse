package accioJob;

import java.util.*;
import java.io.*;


public class NearestOneInAbinarymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[m][n];

        //int one_i[]=new int[n*m];
       //  int one_j[]=new int[n*m];
          int diff[]=new int[n*m];
         int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               arr[i][j]=sc.nextInt();
               if(arr[i][j]==1)
               {
                 // one_i[count]=i;
                //  one_j[count]=j ;
                  diff[count]=Math.abs(i-j);
                   count++;
               }
            }
        }
       

         for(int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                if(arr[i][j]==0)
                 {
                	//System.out.print("before:"+i+" "+j+" "+Math.abs(i-j)+"\n");
                     int min=600;
                       for(int k=0;k<count;k++)
                        {
                          int res=(Math.abs(i-j)+diff[k]);
                          System.out.print(res+" ");
                          if(res<min) 
                            {
                              min=res;
                              arr[i][j]=min;
                            }
                         // System.out.println();
                         } 
                       System.out.print("v:"+min+" ");
                      //  System.out.print(arr[i][j]+" ") ;
                  } 
                 // System.out.print(arr[i][j]+" ") ;
             }
           //  System.out.println(); 
         }

     /*    for(int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
               System.out.print(arr[i][j]+" ") ;  
             }
              System.out.println(); 
         }
*/
         //for(int i=0;i<count;i++)
          //  System.out.print(diff[i]);
	}

}
