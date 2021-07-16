package Large_companies_interview_questions;

import java.util.Stack;

public class Deutsche_adjacent_aplabets {

	public static void main(String[] args) {
		
	String m = "AABBCCCDD";
	char [] chars = m.toCharArray();
	
		
	      char prev = '\0';
	    
	        int k = 0;
	 
	        for (char c: chars)
	        {
	            if (prev != c)
	            {
	                chars[k++] = c;
	                prev = c;
	            }
	           
	            
	        }
	        
	      
	           String p = new String (chars).substring(0, k);
	           System.out.println(p);
     
	}
	
	}

