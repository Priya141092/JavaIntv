package Large_companies_interview_questions;

public class Substring_stringcncat {

	public static void main(String[] args) {
		String p = "1230123345012123345678";
		
		int count=0;
		String k ;
		
		for(int i=0;i<p.length();i++)
		{
			
			for(int j=i;j<p.length();j++)
			{
				k =p.substring(i, j+1);
			    // System.out.println(k);
			
			if(k.length()==3)
			{
				count=count+1;
			}
			}
			
			
			
			
			
		}
		System.out.println(count);

	}

}
