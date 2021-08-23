package Java_Programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s = "Mother In Law";
		String k = "Hitler Woman";
		
		boolean status = true;
		
		String s1 = s.replaceAll(" ", "");
		String k1 = k.replaceAll(" ", "");
		
		if(s1.length() != k1.length())
		{
		 status = false;
		}
		
		else
		{
			
			char [] s1arr = s1.toLowerCase().toCharArray();
			char [] k1arr = k1.toLowerCase().toCharArray();
			
			Arrays.sort(s1arr);
			Arrays.sort(k1arr);
			
			status = Arrays.equals(s1arr, k1arr);
			
		}
		
		 if(status)
	        {
	            System.out.println(s1+" and "+k1+" are anagrams");
	        }
	        else
	        {
	            System.out.println(s1+" and "+k1+" are not anagrams");
	        }
	
		
		
		
		
		
		
		

	}

}
