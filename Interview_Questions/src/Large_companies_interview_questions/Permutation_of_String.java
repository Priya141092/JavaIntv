package Large_companies_interview_questions;

import java.util.Scanner;

public class Permutation_of_String {
	

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		PrintPermutation(str, "");

	}

	public static void PrintPermutation(String quest, String ans) {
		
		if(quest.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<quest.length();i++)
		{
			char ch = quest.charAt(i);
			String leftpart= quest.substring(0,i);
			String rightpart = quest.substring(i+1);
			
			String finalans= leftpart+rightpart;
			PrintPermutation(finalans,ans+ch);
		}
		
		
	}

}
