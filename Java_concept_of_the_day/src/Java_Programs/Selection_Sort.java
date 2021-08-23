package Java_Programs;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a = {2,8,7,6,5,4,1};
		
		int temp,pos;
		
		
		for(int i=0;i<a.length;i++)
		{
			pos=i;
			
			for(int j =i+1;j<a.length;j++)
			{
				if(a[j]<a[pos])
				{
					pos=j;
				}
				
				temp=a[i];
				a[i]=a[pos];
				a[pos]= temp;
			}
			
			System.out.print(a[i]);
		}
		
	}

}
