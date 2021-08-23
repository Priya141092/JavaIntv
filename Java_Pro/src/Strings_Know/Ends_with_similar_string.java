package Strings_Know;

public class Ends_with_similar_string {
	
	
	public static void main(String args[])
	{
		
		String s1 = "Priya is a good girl";
		String s2 = "this is a nice girl";
		String end_str = "rl";
		
		
		boolean ends1 = s1.endsWith(end_str);
		boolean ends2 = s2.endsWith(end_str);
		
		System.out.println("Ends with"+ends1);
		System.out.println("Ends with"+ends2);
	}

}
