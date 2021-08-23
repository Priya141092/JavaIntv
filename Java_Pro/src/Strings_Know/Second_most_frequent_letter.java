package Strings_Know;

import java.util.HashMap;
import java.util.Map;

public class Second_most_frequent_letter {

	public static void main(String[] args) {
	  
	   
	   HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	   String m = "pppriyaa";
	   char [] l = m.toCharArray();
	   
	   for(char k:l)
		   
	   {
		   
		   if(hm.containsKey(k))
		   {
			  hm.put(k, hm.get(k)+1);
		   }
		   
		   else
		   {
			   hm.put(k, 1);
		   }
		   
		   
		   for(Map.Entry entry : hm.entrySet())
			   
		   {
			  System.out.println(entry.getKey() +" "+entry.getValue());
			  
		  
		   }
	   }
	   

	}

}
