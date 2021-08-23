package Java_Programs;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Consecutive_alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b = "aaabbbccddeeeffff";
		char[]m = b.toCharArray();
		
		
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<b.length();i++)
		{
			
			char c = b.charAt(i);
			Integer val = hm.get(c);
			if(val!=null)
			{
				hm.put(c, val+1 );
				
			}
			else
			{
				hm.put(c,1);
			}
			
			
		}
		
		System.out.println(hm);

	}

}
