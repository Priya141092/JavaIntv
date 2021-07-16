package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;



public class Sorting_Hashmapp {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(1, 1);
		hm.put(2, 5);
		hm.put(3,2);
		hm.put(4, 6);
		System.out.println(hm);
		
//		Set<Entry<Integer, Integer>> set1 = hm.entrySet();
//      Iterator it =  set1.iterator();
//        while(it.hasNext()) {
//              Map.Entry me = (Map.Entry)it.next();
//              System.out.print(me.getKey() + ": ");
//              System.out.println(me.getValue());

	
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>(hm); 
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
             Map.Entry me2 = (Map.Entry)iterator2.next();
             System.out.print(me2.getKey() + ": ");
             System.out.println(me2.getValue());
        }
	}
}
