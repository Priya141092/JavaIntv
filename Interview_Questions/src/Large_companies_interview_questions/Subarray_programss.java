package Large_companies_interview_questions;

public class Subarray_programss {

	public static void main(String[] args) {


		  int a[] = {1,2,3,4,5,6,7};
		  int sum = 10;
		  
		  int count = 0;
		  
		  for(int i=0;i<a.length;i++)
		  {
             count = count+a[i];

					  
			  
		  
		  if(count==sum)
		  {
			 for(int j=0;j<=i;j++)
			 {
				 System.out.println(a[j]);
				
			 }
		  }
		  }
		  
	
		  
		 
	}

}
