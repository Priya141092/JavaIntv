package Java_quests;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		int sum=0;
		int rem;
		
		int str=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
			
		}
		
		System.out.println(sum);
		
		
		
		if(sum==str)
		{
			System.out.println("Its a palindrome number");
		}
		
		else
		{
			System.out.println("its not a palindrome");
		}
		
	}

}
