package Large_companies_interview_questions;

import java.util.Stack;

public class Deutsche_adjacent_aplabets {

	public static void main(String[] args) {
     
		String k = "AABBBBBCCDD";
		char [] m = k.toCharArray();
		String rev = "";
		
		
		Stack<Character> st = new  Stack<>();
		
		
		for(char d : m)
		{
		
	if(st.isEmpty() || m[d]!=st.peek())
	{
		st.add(m[d]);
		
		}
	
	else
	{
		st.pop();
	
		}
	
	while(!st.isEmpty())
	{
		rev=rev+st.peek();
		st.pop();
	}
	
	}
		System.out.println(rev);
}
}
