package Java_quests;

import java.util.HashMap;

public class Second_most_frequent_Hash_Map {

	public static void main(String[] args) {

   String p = "latestdataa";
   int first=0;
   int second=0;
   Character ans=null;
   
   
   HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
   
   for(char c : p.toCharArray())
   {
	   
	   if(!hm.containsKey(c))
	   {
		   hm.put(c, 1);
	   }
		  
	   else
	   {
		   hm.put(c, hm.get(c)+1);
	   }

   }
   System.out.println(hm);
   
   for(char c: hm.keySet())
   {
	   if(hm.get(c) > first)
	   {
		   second=first;
		   first=hm.get(c);
	   }
	   else if(hm.get(c)>second && hm.get(c)< first)
	   {
		   second=hm.get(c);
		   ans=c;
	   }
   }
   System.out.println(ans);
   

	}

}
