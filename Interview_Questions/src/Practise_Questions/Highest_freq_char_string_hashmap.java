package Practise_Questions;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Highest_freq_char_string_hashmap {

	public static void main(String[] args) {
String s = "ppriyaasaxenaaa";
		
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = hm.entrySet();
        
        int maxCount = 0;
         
        char maxChar = 0;
         
        for (Entry<Character, Integer> entry : entrySet) 
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                 
                maxChar = entry.getKey();
            }
        }
         
         
        System.out.println("Maximum Occurring char and its count :");
         
        System.out.println(maxChar+" : "+maxCount);
		
		

	}



		

	}


