package Naveen_intv_questns;

public class Rearrange_alternating_positive_negative {

	public static void main(String[] args) {
		
		int a[] = {-1,-2,-3,5,-6,7,8};
		//-6,-3,-2,-1,5,7,8
		int n = a.length;
		int temp,temp1;
		
		
		for(int i=0;i<=n-1;i++)
		{
			for(int j=i+1;j<=n-1;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
				
		}
		}
//			for(int k=0;k<n;k++)
//			{
//				System.out.println(a[k]);
//			}
		
		int m=0;
		int l=n-1;
		
		
		if(a[l]>0 &&a[m]<0 &&m<l)
		{
			l--;
			m=m+2;
			temp1= a[m];
			a[m]=a[l];
			a[l]=temp1;
			
			
		}
		
		
		for(int k=0;k<=n-1;k++)
		{
			System.out.println(a[k]);
		}
		
		}
		
		
			
		}
	



