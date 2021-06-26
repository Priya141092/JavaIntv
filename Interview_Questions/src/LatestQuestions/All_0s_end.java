package LatestQuestions;

public class All_0s_end {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,0,4,0,3,0,6};
		
		int temp;
		
		for(int i=0;i<a.length-1;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				
				
			}
				
		}
		}
		
		for(int k=0;k<a.length;k++) {
		System.out.println(a[k]);
		}
		}
		
	}
	


