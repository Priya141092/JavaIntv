
public class Second_Smallest_Array {

	public static void main(String[] args) {
		
		int a[]= {3,6,8,1};
		
		int temp;
		
		for(int i=0;i<=a.length-1;i++)
		{
			
			for(int j=i+1;j<=a.length-1;j++)
			{
				
				if(a[i]>a[j])
				{
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.println(a[i]);
			System.out.println("Second Samllest number");
			System.out.println(a[1]);
		}
		
		
		

	}

}
