package Java_quests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Longest_Even_length_substing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String m = "Thsiisacoolwrd";
		
		
		for(int i=0;i<m.length();i++)
		{
			for(int j=i;j<m.length();j++)
				
			{
		String l = m.substring(i, j+1);
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(l.length()));
		//System.out.println(al);
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>(al);
		System.out.println(lh);
		
		//Set<Integer> set = new HashSet<>(Arrays.asList(h));
		//TreeSet myTreeSet = new TreeSet(set);
		//System.out.println(myTreeSet);
		
//    ArrayList<Integer> f = new ArrayList<>(Arrays.asList(h));
//    Collections.max(f, null);
    
    
//    Collections.sort(f, Collections.reverseOrder());
//    Collections.reverse(f);
    
    //System.out.println(f);
		
		//if(h % 2 ==0)
		{
			
			//System.out.println(l);
			
		}
	}
		
		}
	}
}
 