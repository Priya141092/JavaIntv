package Arrays_prac;

public class Remove_specific_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,5,6,7,8};
		
		int index = 3;
		
		for(int i=index;i<a.length-1;i++)

	{
			a[i]=a[i+1];
	}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
