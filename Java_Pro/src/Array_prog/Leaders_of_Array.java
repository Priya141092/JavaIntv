package Array_prog;

public class Leaders_of_Array {

	public static void main(String[] args) {
		
		int a[] = {1,2,5,6,4,3};
		int j;
		
		
		for(int i=0;i<a.length;i++)
		{
			for( j=i+1;j<a.length;j++)
			{
				if(a[i]>=a[i+1])
				{
					System.out.println(a[i]);
				}
				//break;
			}
		
//			if(j==a.length)
//			{
//		System.out.println(a[i]);
//			
//			}
		}
		
	}

}
