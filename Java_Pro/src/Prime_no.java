import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = sn.nextInt();
		
		
		
		for(int i= 2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				System.out.println("The number is not prime");
				
			}
			
			else
			{
				System.out.println("the number is  prime");
			}
		}
		sn.close();
		
		

	}

}
