package Large_companies_interview_questions;

public class Test3 {

	public static void main(String[] args) {
	//input = a,b,$,c
	//output= c,b,$,a
		//input %,&,a,c,&,%,g,h,*,% ==>
		
		char [] m =  {'a','b','%','c','%'};
		 int n = m.length;
		 char temp;
		int i=0;
		int j = m.length-1;
		
			 while(i<j)
			 {
				 if(!Character.isAlphabetic(m[i]))
						 {
					 i++;
						 }
				 else if(!Character.isAlphabetic(m[j]))
						 {
					 j--;
						 }
				 
				 else
				 {
					 temp=m[i];
					 m[i]=m[j];
					 m[j]=temp;
					 i++;
					 j--;
				 }
				 
			 }
			 
			 String rev =  new String(m);
		     System.out.println(rev);
			 
			 
		 
		 
		 
			 
			 
		
		

	}
	

}
