package Java_Programs;

public class Reverse_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12356;
		int s=0;
		int rem;
		
		while(num>0)
		{
			rem= num%10;
			s=s*10+rem;
			num=num/10;
			
		}
		System.out.println(s);
		
		
		

	}

}
