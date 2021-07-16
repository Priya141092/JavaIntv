package Large_companies_interview_questions;

import java.util.HashMap;

public class countwrds {

	public static void main(String[] args) {
		String p = "My name is Priya";
		
		String k[]  = p.split(" ");
		
		
		
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		
		for(int i=0;i<k.length;i++)
		{
			
			if(hm.containsKey(k[i]))
			{
				hm.put(k[i], hm.get(k[i])+1);
			}
			
			else
			{
				hm.put(k[i], 1);
			}
		}
		System.out.println(hm);
		
		
		
		
		
		

	}

}
