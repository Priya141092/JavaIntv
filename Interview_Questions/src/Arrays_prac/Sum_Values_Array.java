package Arrays_prac;

public class Sum_Values_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,5,6,7,8};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
