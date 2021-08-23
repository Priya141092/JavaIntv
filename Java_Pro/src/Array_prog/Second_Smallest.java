package Array_prog;

public class Second_Smallest {
	
	public static void main(String[] args)
	{
	
	int b[] = {2,5,7,3,4,1 };
	int min = b[0];
	int sec_min=b[0];
	
	
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
			if(b[j]<min)
			{
				min=b[j];
			}
			
			else if(sec_min<min)
			{
				sec_min=min;
			}
				
			
		}
		
	}
	System.out.println(sec_min);
	}
	

}
