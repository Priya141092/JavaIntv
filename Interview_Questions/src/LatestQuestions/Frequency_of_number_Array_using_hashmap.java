package LatestQuestions;
import java.util.*;
import java.util.Map.Entry;

public class Frequency_of_number_Array_using_hashmap {

	public static void main(String[] args) {


		
		int a[] = {1,3,4,3,5,4,1,4,4};
		
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		
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
		System.out.println(hm);
		
		Set<Entry<Integer, Integer>> entrySet = hm.entrySet();
		 int maxcount=0;
		 int maxvalue=0;
		 
		 for (Entry<Integer, Integer> entry : entrySet) 
	        {
	            if (entry.getValue() > maxcount)
	            {
	                maxcount = entry.getValue();
	                 
	                maxvalue = entry.getKey();
	            }
	        }
		 System.out.println("the"+maxcount+"test"+maxvalue);

}
}
