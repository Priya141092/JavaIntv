package LatestQuestions;

public class Second_Largest_element_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {8,2,5,7,6,9};
		int max =a[0];
		int secmax=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max<=a[i])
			{
				max=a[i];
			}
			else
			{
				secmax=max;
			}
		}
		System.out.println(secmax);
		
	}

}
