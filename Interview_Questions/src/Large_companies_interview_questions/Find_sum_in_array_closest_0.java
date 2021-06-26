package Large_companies_interview_questions;

import java.util.Arrays;

public class Find_sum_in_array_closest_0 {

	public static void main(String[] args) {

       int a[] = {-10,7,8,3,-1};
       int n = a.length;
      // Arrays.sort(a);
//       for(int k=0;k<a.length;k++)
//       {
//    	   System.out.println(a[k]);
//       }
       
       int one = a[0];
       int two= a[1];
       int minsum = one +two;
       int l =0;
       int r=1;
//       int sum=0;
       int sum;
       
       
       for(int i=0;i<n;i++)
       {
    	   for(int j=i+1;j<n-1;j++)
    		   
    	   
    	   {
    		   sum=a[i]+a[j];
    		   if(Math.abs(sum) <  Math.abs(minsum))
    		   {
    			  minsum=sum;
    			  l=i;
    			  r=j;
    		   }
    		   
    	   }
    	  
       }
       System.out.println(a[l]);
		  System.out.println(a[r]);
    }

}
