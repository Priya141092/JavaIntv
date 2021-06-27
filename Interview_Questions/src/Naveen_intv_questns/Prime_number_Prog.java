package Naveen_intv_questns;

public class Prime_number_Prog {
	
	
	public static boolean isPrime(int num)
	
	{
		
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

	
	public static void getPrimenumber(int num)
	{
		for(int i=5;i<=num;i++)
			if(isPrime(i))
			{
		System.out.println(i);
			}
	}
	public static void main(String[] args) {


		System.out.println(isPrime(23));
		getPrimenumber(13);
	}

}
