package Java_quests;

import java.util.HashMap;

public class Number_Words_using_hash_map {

	public static void main(String[] args) {
		String k ="priya is a good girl";
		
		String split[] = k.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(int i=0;i<split.length;i++)
		{
			
			if(hm.containsKey(split[i]))
			{
				int count = hm.get(split[i]);
				hm.put(split[i], count+1);
			}
			
			else
			{
				hm.put(split[i], 1);
			}
		}
		
System.out.println(hm);
	}

}
