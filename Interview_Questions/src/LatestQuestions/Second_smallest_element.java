package LatestQuestions;

public class Second_smallest_element {

	public static void main(String[] args) {
	
		int a[] = {9,2,7,8,5};
		int temp;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
		System.out.println(a[a.length-1]);

	}

}
