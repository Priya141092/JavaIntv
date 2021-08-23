package Strings_Know;


public class Ocurence_of_certain_character {

	public static void main(String[] args) {
		
		
		String s1 = "Priya is a great girllll and she is rll";
		String s2="rll";
		
		String str = "helloslkhellodjladfjhello";
		String findStr = "hello";
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {
		    lastIndex = str.indexOf(findStr,lastIndex);

		    if( lastIndex != -1)
		        count++;

		    lastIndex += findStr.length();
		}

		System.out.println(count);
		
	
		}

	}


