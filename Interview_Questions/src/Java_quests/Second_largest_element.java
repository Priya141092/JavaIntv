package Java_quests;

public class Second_largest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a [] = {1,3,2,6,5};
		int largest = a[0];
		int seclargest=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					largest=a[i];
				}
				
				else if(a[i]>largest && a[j]<a[i])
				{
					largest=a[i];
					seclargest=a[j];
					
				}
				
				
			}
			
		}
		System.out.println(seclargest);
	}

}
