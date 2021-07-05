package Large_companies_interview_questions;

import java.util.Arrays;

public class Difference_lar_smallest {

	public static void main(String[] args) {
		
		int a[] = {6,7,8,9,3};
		
		int diff;
		
		Arrays.sort(a);
		diff = a[a.length-1]-a[0];
		System.out.println(diff);
		
		
	}

}
