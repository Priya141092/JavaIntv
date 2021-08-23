package Strings_Know;

import java.util.HashMap;
import java.util.Map;

public class Display_first_non_repeated
{
	

public static void main(String args[])

{
	String s = "priyasappyuio";
	int len = s.length();
	HashMap<Integer,Character> m = new 	HashMap<Integer,Character>();
	
	
	for(int i=0;i<len;i++)
	{
		m.put(i+1, s.charAt(i));
		System.out.println(m);
		
	}
	
	}
}