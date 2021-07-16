package Java_quests;

import java.util.Arrays;

public class Longest_consecutive {

	public static void main(String[] args) {
		
		int a[] = {49, 1, 3, 200, 2, 4, 70, 5};
		
		int count=0;
		
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length-1;i++)
		{
		
			
			
			
			if(a[i+1]-a[i]==1)
			{
				count=count+1;
				
				
			}
			
		}
		System.out.println(count);
			
			for(int j=0;j<count;j++)
			{
			 
			 System.out.println(a[j]);
				
			
			}
				
		}
}
		
		
		
		
		


