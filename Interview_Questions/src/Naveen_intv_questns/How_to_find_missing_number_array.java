package Naveen_intv_questns;

public class How_to_find_missing_number_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a [] = {-1,0,1,2,4,5,6,7,8};
		
		int sum=0;int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		for(int j=-1;j<=8;j++)
		{
			sum1=sum1+j;
		}
		
		System.out.println("The missing number is ::"+(sum1-sum));

	}

}
