package Large_companies_interview_questions;

public class Duplicate_ele_array1 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,2,3,6,7,8,9};
		
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)

				{
				
				if(a[i]==a[j])
					count=count+1;
				}

	}
		

		
		System.out.println(count);
}
}
