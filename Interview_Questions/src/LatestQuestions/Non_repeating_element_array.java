package LatestQuestions;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Non_repeating_element_array {

public static void main(String[] args) {

  int a[] = {1,1,2,2,3,3,6,8,6,7};
  
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    
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
    }
    
    
    Set<Entry<Integer,Integer>> entrys = hm.entrySet();
    
    int maxvalue=1;
    int minvalue=0;
    
    for(Entry<Integer, Integer> entry1 : entrys)
    {
    	if (entry1.getValue() == maxvalue)
        {
    		System.out.println("First is"+entry1.getKey());
    		System.out.println(entry1.getValue());
        }
        }
    }
}



    	
    
  
    

	


