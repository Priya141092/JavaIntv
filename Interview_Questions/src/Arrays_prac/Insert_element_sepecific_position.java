package Arrays_prac;

public class Insert_element_sepecific_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,4,5,6};
		
		int index=2;
		int num =3;
		
		
		for(int i=a.length-1;i>index;i--)
		{
			a[i]=a[i-1];
			
			
		}
		a[index]=num;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		

	}

}
