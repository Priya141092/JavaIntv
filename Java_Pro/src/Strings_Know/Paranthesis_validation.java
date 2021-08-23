package Strings_Know;

import java.util.Scanner;

public class Paranthesis_validation {

	public static void main(String[] args) {
//		
//		Scanner sc= new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String str= sc.nextLine();
		
		String str = "((alf)ls))";
		
		int count = 0;
		int i=0;
		
		
		
		while(i<str.length())
		{
			char ch = str.charAt(i);
			if(ch=='(')
			{
				count++;
			}
			
			else if(ch==')')
			{
				if(count==0)
				{
					System.out.println("");
				}
				else
					count--;
			}
			i++;
		}
		
		if(count!=0)
		{
			System.out.println("inavlid string");
		}
			
		else
			{
				System.out.println("valid string");
			}
		}
		
		
				
		

	}


