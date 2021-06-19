package LatestQuestions;

import java.util.Arrays;

public class Maximum_Product_of_two_integers {

	public static void main(String[] args) {
		
		int product;
		int[] b = new int[15]; 
		int max = b[0];
		int secmax =b[0];
		
		int a[]= {2,4,9,7};
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				
					
					product = a[i]*a[j];
					
					for(int k=0;k<b.length;k++)
					{
						b[k]=product;
						
						if(max<=b[k])
						{
							max=b[k];
						}
						
						else
						{
							secmax=max;
						}
						
					}
					
				
			}
		
			
		}
		System.out.println(max);

	}

}
