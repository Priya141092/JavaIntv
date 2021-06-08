package Java_quests;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hash_map_highest_freq_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4,4,1,1,1,2};
		int maxfreq=0;
		int count=0;
		
		
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i], hm.get(a[i])+1);
			
			}
			
			else
			{
				hm.put(a[i], 1);
				
				
			}
			
			
			
			
//			for (Entry<Integer, Integer> entry : hm.entrySet()) 
//	        { 
//	            System.out.println(entry.getKey() + " " + entry.getValue()); 
//	        } 
			
		}
		
				
		
	}

}
