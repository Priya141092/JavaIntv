package Large_companies_interview_questions;

import java.util.Stack;

public class Balanced_paranthesis {

	public static void main(String[] args) {


		String k ="{(}[]";
		char [] m = k.toCharArray();
		Stack<Character> st = new Stack<>();
		
		for(char ch : m)
		{
			if(ch=='('|| ch=='{'|| ch=='(')
				st.push(ch);
			
			else
			{
				char latestopen = st.pop();
			
			
			if(latestopen=='{' && ch!='}')
				System.out.println("no balanced");
			else if(latestopen=='[' && ch!=']')
				System.out.println("no balanced");
			else if(latestopen=='(' && ch!=')')
				System.out.println("no balanced");
		
				
		}
			
				
			
			
			
		}
		
		
		
		
		

	}
	
}
