package LatestQuestions;

import java.util.Scanner;

public class Array_questn_cardinal {

	public static void main(String[] args) {
		int n;
		int temp;
		int count=0;
		int count1=0;
		
		
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		
		int[] array = new int[5];
		int k=array.length;
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextInt();  
		}  
		//5System.out.println("Array elements are: ");    
		
		
		for(int i=0;i<=array.length-1;i++)
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				if(array[i]>array[j])
				{
					count=count+1;
					
					if(count==k)
					{
						System.out.println("it is in ascending order");
						
					}
					
				}
					
					else if(array[i]<array[j])
					{
						count1=count1+1;
						if(count1==k)
						{
							System.out.println("it is in Descending order");	
						
					}
				
						
//						
					
		
//				
				
			
					else
					{
						System.out.println("Jumbled numbers");
					}
			
			
		}
		}
	}
}
}

	

		
	


