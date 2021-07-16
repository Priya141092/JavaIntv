package Large_companies_interview_questions;

public class Second_Most_Frequent_character {

	public static void main(String[] args) {

String p = "priyasxenana";

int count =0;

int maxcount =0;
int secmaxcount=0;

for(int i=0;i<p.length();i++)
{
	for(int j=i+1;j<p.length()-1;j++)
	{
		if(p.charAt(i)==p.charAt(j))
		{
			count = count+1;
		}
		
		
		
	}
	
	if(count>maxcount)
	{
		maxcount=count;
	}
	
	else 
	{
		secmaxcount=count;
	}
	
  }
  System.out.println(secmaxcount);

	}

}
