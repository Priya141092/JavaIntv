package Large_companies_interview_questions;

public class Editorial_XY_numbers {

	public static void main(String[] args) {
		
		
		//38,34,30,28,
		for(int i=98;i>32;i=i-4)
		{
			if(i%10==0)
			{
				System.out.println(i);
				i=i+2;
				System.out.println(i);
			}
			 
			else
			{
				System.out.println(i);
			}
			
		}
		
         
	}

}
