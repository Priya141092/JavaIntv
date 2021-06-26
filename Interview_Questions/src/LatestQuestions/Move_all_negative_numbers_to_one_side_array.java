package LatestQuestions;

import java.util.Arrays;

public class Move_all_negative_numbers_to_one_side_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {-1,3,-5,4,6,-2};
		int n= a.length;
		int temp;
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
			
			System.out.println(a[i]);
		}
		
		

	}

}
