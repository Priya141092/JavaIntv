package LatestQuestions;

public class Palindrome_program {

	public static void main(String[] args) {
		
		
		int a =525;
		int rem,temp;
		int sum=0;
		temp=a;
		while(a!=0)
		{
			
			rem=a%10;
			sum = (sum*10)+rem;
			a=a/10;
			
			
		}
		
		if(temp==sum)
		{
			System.out.println("Its Palindrome");
		}
		
		else
		{
			System.out.println("Its not palindrome");
		}

	}

}
