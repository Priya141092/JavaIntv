package Large_companies_interview_questions;

public class Longest_palindrome {

	public static void main(String[] args) {

		
		String p = "My name is NitiN";
		char [] m = p.toCharArray();
		String k;
		int highest =1;
		
		for(int i=0;i<p.length();i++)
		{
		
			for(int j=i;j<p.length();j++)
			{
				 k = p.substring(i,j+1);
				 StringBuffer sb = new StringBuffer(k);
				StringBuffer d =  sb.reverse();
				String x = d.toString();
				//System.out.println(x);
				
				if(x.equals(k))
				{
					//System.out.println(k);
					int z = k.length();
					if(z>highest)
					{
						highest=z;
						System.out.println(z);
					}
					
					
					
				}
				 
				 
				 
				
				
			}
		
		}
   
		
		
		
		
			
		}
		
		

	}


