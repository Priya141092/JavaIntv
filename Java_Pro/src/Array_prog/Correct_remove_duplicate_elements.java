package Array_prog;

import java.util.Arrays;

public class Correct_remove_duplicate_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,4,5,4};
		
		int m=0;
		int unique_elements = arr.length;
		
		for(int i=0;i<=unique_elements-1;i++)
		{
			for(int j=i+1;j<=unique_elements-1;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[unique_elements-1];
					unique_elements--;
					j--;
				}
			
			}
			
		}
		int array1[]=Arrays.copyOf(arr, unique_elements);
		
		for(int k=0;k<array1.length;k++)
		{
			System.out.println(array1[k]);
		}
		
	}

}
