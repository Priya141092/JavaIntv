package Array_prog;

public class Difference_between_numbers {

	public static void main(String[] args) {
	
		
		int a[]= {1,5,2,3,9,12};
		int temp,largest;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>=a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			
				
		}
			//System.out.println(a[i]);
			largest= a[5]-a[0];
			System.out.println(largest);		
			
		}

	}

}
