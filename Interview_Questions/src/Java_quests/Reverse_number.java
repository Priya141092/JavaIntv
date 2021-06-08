package Java_quests;

public class Reverse_number {

	public static void main(String[] args) {
		
		int a = 9866;
		int sum=0;
		
	while(a>0)
	{
		int digit = a%10;
		sum = sum*10+digit;
		a/=10;
		
	}
System.out.println(sum);
	}

}
