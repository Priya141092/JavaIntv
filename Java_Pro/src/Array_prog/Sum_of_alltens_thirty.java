package Array_prog;

public class Sum_of_alltens_thirty {

	public static void main(String[] args) {
	
		
		int total =30;
		int sum =0;
		int a [] = {11,23,10,24,10,54,10,10};
		
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==10)
			{
				sum=sum+10;
				
			}
			
			
		}
		
		System.out.println("sum is "+sum);
		
		if(sum==total)
		{
			System.out.println("it is 30");
		}
		else
		{
			System.out.println("Btter luck next time");
		}
		
	}

}
