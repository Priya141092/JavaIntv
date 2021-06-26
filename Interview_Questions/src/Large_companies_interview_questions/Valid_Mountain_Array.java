package Large_companies_interview_questions;

public class Valid_Mountain_Array {

	public static boolean main(String[] args) {
		
		int a[] = {6,7,8,2,3,1};
		
		
		if(a.length<3)
		{
			return false;
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
		if(a[i]>a[i+1])
		{
			i++;
			break;
		}
		else if(a[i]==a[i+1])
		{
			return false;
		}
		
		}
		if(a.length<2)
		{
			return false;
		}
		
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j-1]<a[j])
			{
				return false;
			}
		}
		return true;
	}

}
