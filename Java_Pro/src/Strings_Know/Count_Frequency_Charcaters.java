package Strings_Know;

import java.util.HashMap;
import java.util.Map;

public class Count_Frequency_Charcaters {
	
	

	public static void main(String[] args) {
		
		String m = "priyapiopar";

		int count =0;
		
		HashMap<Character,Integer> c1 = new HashMap<Character,Integer>();
		
		char[] array1 = m.toCharArray();
		
		for(char c:array1)
		{
			if(c1.containsKey(c))
			{
				c1.put(c, c1.get(c)+1);
			}
			
			else
			{
				c1.put(c,1);
			}
			
			for (Map.Entry entry : c1.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 
		}
		
		
	}
}


