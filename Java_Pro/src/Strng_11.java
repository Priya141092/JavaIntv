public class Strng_11 {

	public static void main(String[] args) {
		
		int a[]= {1,0,0,1,1};
		//int b[]= { };
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++) {
			if(a[i]==1)
			{
				a[j]=a[i];
			}
			else if(a[i]==0)
			{
				a[j-1]=a[i];
			}
			System.out.println("The array is "+a[j]);
			}
		}
	

	}

}
