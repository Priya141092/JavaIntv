package LatestQuestions;

public class Second_smallest_second_largest {

	public static void main(String[] args) {
		
		int a[] = {4,9,1,2,7,8,3};
		int n= a.length;
		
		int largest = a[0];
		int sclargest = a[0];
		
		for(int i=0;i<n;i++)
		{
			
				if(a[i]>largest)
				{
					largest=a[i];
				}
				
				else if(a[i]<largest && a[i]>sclargest)
				{
			   sclargest=a[i];
				}
			}
			
		
		System.out.println(sclargest);

	}

}
