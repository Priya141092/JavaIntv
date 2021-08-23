
public class Minimum_Maximum_value_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {1,4,6,9,3};
		
		int min =arr[0];
		int max =arr[0];
		int b=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=min)
			{
				min=arr[i];
				System.out.println("Minimim is"+min);
			}
			
			else if(arr[i]>=max)
			{
				max=arr[i];
				
				System.out.println("Maximum is"+max);
				
			}
			
			
		}
		

	}

}
