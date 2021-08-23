
public class Second_largest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,5,7,8,4};
		
		int largest =a[0];
		int secondlargest=a[1];
		
		
		
		for(int i=0;i<a.length;i++)
    
		{
			
			if(a[i]>=largest)
			{
				largest=a[i];
				
			}
			else if(a[i]>=secondlargest && a[i]<=largest)
				
			{
				secondlargest=a[i];
			}
			
			
			
	}
		System.out.println(largest);
		System.out.println(secondlargest);

	}

}
