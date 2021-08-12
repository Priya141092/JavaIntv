package Arrays_prac;

public class Sort_Numeric_And_String_Arrays {

	public static void main(String[] args) {
		String temp;
		int a[] = {5,2,3,4,1};
		String [] k = {"Priya","saxena","Test","New"};
		
			
		
		for(int i=0;i<k.length;i++)
		{
			for(int j=i+1;j<k.length;j++)
			{
				if(k[i].compareTo(k[j])>0)
						{
					temp = k[i];
					k[i]=k[j];
					k[j]=temp;
						}
			}
			System.out.println(k[i]);
		}
		
		
		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//			System.out.println(a[i]);
//		}

	}

}
