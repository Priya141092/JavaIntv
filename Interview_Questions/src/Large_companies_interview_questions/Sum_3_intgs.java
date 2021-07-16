package Large_companies_interview_questions;

public class Sum_3_intgs {

	public static void main(String[] args) {

   int a[] = {1,2,3,4,5,6};
   int sum = 11;
   
   //int sum2 =0;
   
   for(int i=0;i<a.length-2;i++)
   { int sum2=0;
	   
	   sum2 = a[i]+a[i+1]+a[i+2];
	   
	   System.out.println(sum2);
	   
	   if(sum2==sum)
	   {
		   System.out.println(a[i]+""+a[i+1]+""+a[i+2]);
	   }
   }
   
   

	}

}
