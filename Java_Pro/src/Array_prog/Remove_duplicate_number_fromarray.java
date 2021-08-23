package Array_prog;

public class Remove_duplicate_number_fromarray {

	public static void main(String[] args) {
		
		int a[] = {1,6,5,6,7,9};
		
		int temp;
		int m=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			
			}
			System.out.println(a[i]);
			
		}
		System.out.println("********************");
		for(int k=0;k<a.length;k++)
		{
			if(a[k]!=a[k+1])
			{
				a[m++]=a[k];
			}
			
		
			a[m++]=a[a.length-1];
			
		}
		System.out.println(a[m]);
		
		
		
		
	}

}
