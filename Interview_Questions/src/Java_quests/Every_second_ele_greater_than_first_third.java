package Java_quests;

import java.util.Arrays;

public class Every_second_ele_greater_than_first_third {

	public static void main(String[] args) {
	
		
		int a[] = {1,3,2,4,5,7};
		
		Arrays.sort(a);
		int temp;
		
		int r ;
		
		int length = a.length-1;
		
		
		int temp2 = a[a.length-1];
		//System.out.println(temp2);
		
		for(int i=1;i<a.length-2;i=i+2)
		{
			
			if(a[i]<a[i+1])
				
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
			}
			
			
			
				 r = a[a.length-2];
				 a[a.length-2]=a[a.length-1];
				 a[a.length-1]=r;
		}
			
		
		
		
		 
		for(int j=0;j<a.length;j++)
			{
				System.out.println(a[j]);
			}
	}
		
	}
	


