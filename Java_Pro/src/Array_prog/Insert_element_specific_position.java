package Array_prog;

public class Insert_element_specific_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,5};
		int b = 4;
		int index=2;
		
		
		
		for(int i=a.length-1;i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=b;
		for(int k=0;k<=a.length-1;k++)
		{
		System.out.println(a[k]);
		}

	}
	

}
