package Strings_Know;

public class non_repaet {

	public static void main(String[] args) {
		String charHolder;  // Holds 
		String testString = "8uiuiti080t8xt8t";
		char   testChar = ' ';
		int count = 0;  

		for (int i=0; i <= testString.length()-1; i++) {
		    testChar = testString.charAt(i);

		    for (int j=0; j <= testString.length()-1; j++) {
		        if (testChar == testString.charAt(j)) {
		           count++;
		        }
		    }
		    if (count == 1) { 
		    	break; 

		   };
		       count = 0;
		}

		System.out.println("The first not repeating character is " + testChar);

	}

}
