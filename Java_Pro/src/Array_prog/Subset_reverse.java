package Array_prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_reverse {

	public static void main(String[] args) {
		int a[] = {1,3,5,7,9,11,15,17,19};
// Output: [5,3,1,11,9,7,19,17,15].
		
		List<int[]> list = Arrays.asList(a);
		list.add(a);
		System.out.println(a);
	}

}
