package Strings_Know;

import java.util.HashSet;
import java.util.Set;

public class Biggest_substring {

	public static void main(String[] args) {
		
		
		String m = "Priyasaxenap";
		
	  int maxcount =0;
	  int i =0;
	  int j=0;
	  int strlen = m.length();
	  
	  Set <Character> st = new HashSet<Character>();
	  while(i<strlen && j< strlen)
	  {
		  if(!st.contains(m.charAt(j)))
		  {
			  st.add(m.charAt(j));
			  j++;
			  maxcount = Math.max(maxcount, j-i);
			 // System.out.println(m.charAt(maxcount));
		  }
		  else
		  {
			  st.remove(m.charAt(i));
			  i++; 
		  }
	  }
	  System.out.println(maxcount);
	 
	 
	
	  }
	

	}


