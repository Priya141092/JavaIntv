package LatestQuestions;

import java.util.Arrays;

public class To_remove_sepcifoed_character_from_string1 {

	public static void main(String[] args) {
		
		String k = "Parriyaa";
		char b = 'a';
		
	
		StringBuilder sb =  new StringBuilder();
		char [] m = k.toCharArray();
		
		for(int i=0;i<m.length;i++)
		{
			if(m[i]!= b)
			{
				sb.append(m[i]);
			}
		}
		
		Arrays.sort(m);
		System.out.println(sb);
		
		
		

	}

}
