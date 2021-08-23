package Array_prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Insert_specific_element {

	public static void main(String[] args) {
		int[] ar = {1,2,4,6,8};
		
		  //ArrayList<Integer> ct= new ArrayList<Integer>();
		//List<int[]> l1b = Arrays.asList(ar);
		  
		List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
	      System.out.println(list);
	      list.add(3, 7);
	      System.out.println(list);
		  
	}	  
}
