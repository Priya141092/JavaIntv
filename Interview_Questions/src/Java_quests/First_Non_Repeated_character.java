package Java_quests;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class First_Non_Repeated_character {

	public static void main(String[] args) {
		String str= "Priyasaxena";
		
		Character c;
		
		
		HashMap<Character,Integer>hm= new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
			}
			
			else
			{
				hm.put(str.charAt(i), 1);
			}
			
			for (i =0 ; i < str.length() ; i++ )
	        {
	            c= str.charAt(i);
	            if( hm.get(c)  == 1 )
	            System.out.println(c);
			
			
		}
		
		}
	}

}
