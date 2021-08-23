package Java_Programs;

public class Zeros_from_Array {
	
	public static void main(String args[])
	{
		int[] arr1 = {14, 0, 5, 2, 0, 3, 0};
		int size = arr1.length;
		int count =0;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=0)
			{
				arr1[count]= arr1[i];
				count++;
				
			}
		}
		
		
			while(count<size)
			{
				arr1[count]=0;
				count++;
				
			}
			
			for(int j=0;j<arr1.length;j++)
			{
				System.out.println(arr1[j]);
			}
		
			
		
	}
		
  
	}


	
	
	
	

	
	

