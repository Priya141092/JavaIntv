package Java_quests;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =15;
		int status=0;
		
		for(int i=2;i<num/2;i++)
			
		{
			if(num%i==0)
			{
				System.out.println(" not a prime num");
				
			}
			
			else
			{
				System.out.println("prime number");
			}
		}
		

	}

}
