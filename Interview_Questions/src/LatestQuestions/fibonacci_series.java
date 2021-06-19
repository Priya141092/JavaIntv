package LatestQuestions;

public class fibonacci_series {

	public static void main(String[] args) {


		 //0,1,1,2,3,5
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		int num = 50;
		
		
		for(int i=2;i<=100;i++)
		
	{
			c=a+b;
			if(c>10)
				break;
			System.out.println(c);
			
			a=b;
			b=c;
			
		}
		

	}

}
