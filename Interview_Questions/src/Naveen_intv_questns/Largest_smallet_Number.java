package Naveen_intv_questns;

import java.util.Arrays;

public class Largest_smallet_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {2,5,7,-9,67};
		int largest = num[0];
		int smallest = num[0];
		
		
		for(int i=1;i<num.length;i++)
		{
			
			if(num[i]>largest)
			{
				num[i]=largest;
			}
			
			else if(num[i]<smallest)
			{
				smallest=num[i];
			}
			
		}
		System.out.println(Arrays.toString(num));
		System.out.println(largest);
		System.out.println(smallest);

	}

}
