package Naveen_intv_questns;

public class Remove_special_junk_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "@@###%%% priya77&&88## test";
		//Since s is immutable applyng repalce all on String s
		
		s = s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s);

	}

}
