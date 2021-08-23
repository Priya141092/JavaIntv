package Array_prog;

public class Smallest_Second_Smallest {

	public static void main(String[] args) {

		
		int b[] = {1,6,5,2,3,9};
		int temp;
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				
				if(b[i]<b[j])
				{
					temp=b[j];
					b[j]=b[i];
					b[i]=temp;
					
					
					
				}
		
			}
		System.out.println(b[i]);
		}

	}

}
