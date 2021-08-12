package Arrays_prac;

public class Average_Sum_Elements_Array {

	public static void main(String[] args) {
		
		int a[] = {1,4,5,7,8};
		int length1 = a.length;
		int sum=0;
		int average=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			average = (sum/length1);
		}
		
		System.out.println(average);
		
	
	}

}
