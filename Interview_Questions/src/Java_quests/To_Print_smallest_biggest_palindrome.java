package Java_quests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class To_Print_smallest_biggest_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "My name is NitiN";
		String m = "";
		
		for(int i=0;i<s.length();i++)
		
		{
			
			for(int j=i;j<s.length();j++)
			{
				 m = s.substring(i, j+1);
				// System.out.println(m);
					//int h = m.length();
			        
					 StringBuffer sb = new StringBuffer(m);
				 		StringBuffer x = sb.reverse();
				 		//System.out.println(x);
				 		String v = x.toString();
				 		
				 		if(m.equals(v))
				 		{
				 		
				 		System.out.println(m);
				 		
				 		}
					
				
			}
			
		}
		
		

	}

}
