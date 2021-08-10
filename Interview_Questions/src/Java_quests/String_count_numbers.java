package Java_quests;

import java.util.regex.Pattern;

public class String_count_numbers {

	public static void main(String[] args) {
		
		String p = "My name is Priya10";
		
		char [] m =p.toCharArray();
		
		for(int i=0;i<m.length;i++)
		{
			
			if(Character.isDigit(m[i]))
			{
				System.out.println(m[i]);
			}
				
		}
		
		
		
		
		
	}

}
