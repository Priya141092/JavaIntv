package StringByDurgaSoftware;

import java.util.Scanner;

public class Trimm_Program {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you city name");
		String name = sc.nextLine().toLowerCase().trim();
				if(name.equals("hyderabad"))
		{
			System.out.println("Hello Hyd, Aadab");
		}
		
		else if (name.equals("Chennai"))
		{
			System.out.println("Hello, madrasi, Vanakkam");
		}
		
		else if(name.equals("bangalore"))
		{
			System.out.println("hello bang, namaskar");
		}
		
		else
		{
			System.out.println("Enter valid city name");
		}
		

	}

}
