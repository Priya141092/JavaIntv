package Naveen_intv_questns;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsArr {

	public static void main(String[] args) {
          String names [] = {"Java","Python","Ruby","Java"};
		
		//1.compare each element On^2 -- worst solution
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if (names[i].equals(names[j]))
					System.out.println("duplicate ele is ::::"+names[i]);
			}
		}
		
		//Using hash set
		
		Set<String> store = new HashSet<String>();
		
		for(String name1 : names)
		{
			if(store.add(name1)==false)
			{
				System.out.println(" The duplicate is"+name1);
			}
		}

		//3.using HashMap
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		 for(String name2:names)
		 {
			 Integer count = hm.get(name2);
			 if(count==null)
			 {
				 hm.put(name2, 1);
			 }
			 
			 else
			 {
				 hm.put(name2, ++count);
			 }
			 
			 //Entry set comes in the picture here to get the values from hashmap we use entry set 
			 
			 Set<Entry<String,Integer>> entry1 = hm.entrySet();
			 
			 for(Entry<String,Integer> ee : entry1)
				 if(ee.getValue()>1)
				 {
					 System.out.println("the duplicate is"+ee.getKey());
				 }
		 }

	}

}
